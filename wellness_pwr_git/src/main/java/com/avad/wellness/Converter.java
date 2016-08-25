package com.avad.wellness;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Converter {
	
	public static String SEPERATOR = "/"; 
	public static String TYPE_SEPERATOR = "-";
	
	Map <String,MappingInfo> mappingHashMap;
	JSONObject rootObject;
	
	/**
	 * 생성자
	 * @param jsonObject input source
	 * @param mappingInfo mapping 정보
	 */
	public Converter(JSONObject jsonObject, Map<String,MappingInfo> mappingInfoMap) {
		
		this.rootObject = jsonObject;
		this.mappingHashMap = mappingInfoMap;
		
		//initialize		 		
	}
	
	public Converter(String inputSourcePath, String mapping_path){
		
		try{
			
			JSONParser parser = new JSONParser();
			JSONObject inputSourceObject = (JSONObject)parser.parse(new FileReader(inputSourcePath));
			JSONObject mappingObject = (JSONObject)parser.parse(new FileReader(mapping_path));
			
			Map <String,MappingInfo> mappingHashMap = new HashMap<String,MappingInfo>();			
			Set keySet = mappingObject.keySet();
			Iterator it = keySet.iterator();
			while(it.hasNext()){				
				String key = (String)it.next();
				
				JSONObject jsonObject = (JSONObject)mappingObject.get(key);
				if( jsonObject != null){
					MappingInfo mapInfo = new MappingInfo((String)jsonObject.get("mapping"), (String)jsonObject.get("type"), (String)jsonObject.get("unit"));				
					mappingHashMap.put(key, mapInfo);
				}
			}
			
			this.rootObject = inputSourceObject;
			this.mappingHashMap = mappingHashMap;
			
			
		}catch(Exception e){
			
		}
		
	}
	
	/**
	 * mapping 정보를 기반으로 PwrActivityRawDataModel type 으로 return
	 * @return
	 */
	public PwrActivityRawDataModel convert() {
		
		if( mappingHashMap == null || mappingHashMap.size() <= 0) return null;
		if( this.rootObject == null ) return null;		
		
		PwrActivityRawDataModel model = new PwrActivityRawDataModel();
		MappingInfo mapping;
		
		//step
		mapping = mappingHashMap.get("STEP");
		if( mapping != null ) model.setStep(getValue(mapping), mapping);
		
		//distance		
		mapping = mappingHashMap.get("DISTANCE");
		if( mapping != null ) model.setDistance(getValue(mapping), mapping);
		
		//INTENSE_ACTIVE_TIME		
		mapping = mappingHashMap.get("INTENSE_ACTIVE_TIME");
		if( mapping != null ) model.setIntese_active_time(getValue(mapping), mapping);		
		
		//MODERATE_ACTIVE_TIME		
		mapping = mappingHashMap.get("MODERATE_ACTIVE_TIME");
		if( mapping != null ) model.setModerate_active_time(getValue(mapping), mapping);
		
		//SOFT_ACTIVE_TIME		
		mapping = mappingHashMap.get("SOFT_ACTIVE_TIME");
		if( mapping != null ) model.setSoft_active_time(getValue(mapping), mapping);
		
		//SEDENTARY_TIME		
		mapping = mappingHashMap.get("SEDENTARY_TIME");
		if( mapping != null ) model.setSedentary_time(getValue(mapping), mapping);
		
		//LONGEST_ACTIVE_TIME		
		mapping = mappingHashMap.get("LONGEST_ACTIVE_TIME");
		if( mapping != null ) model.setLongest_active_time(getValue(mapping), mapping);		
		
		//CALORIES		
		mapping = mappingHashMap.get("CALORIES");
		if( mapping != null ) model.setCalories(getValue(mapping), mapping);
		
		//BURN_CALORIES		
		mapping = mappingHashMap.get("BURN_CALORIES");
		if( mapping != null ) model.setBurn_calories(getValue(mapping), mapping);
		
		//FLOORS		
		mapping = mappingHashMap.get("FLOORS");
		if( mapping != null ) model.setFloors(getValue(mapping), mapping);
		
		//LATITUDE		
		mapping = mappingHashMap.get("LATITUDE");
		if( mapping != null ) model.setLatitude(getValue(mapping), mapping);
		
		//LONGITUDE		
		mapping = mappingHashMap.get("LONGITUDE");
		if( mapping != null ) model.setLongitude(getValue(mapping), mapping);		

		//LOCATION_NAME		
		mapping = mappingHashMap.get("LOCATION_NAME");
		if( mapping != null ) model.setLocation_name(getValue(mapping), mapping);
		
		//TIMEZONE		
		mapping = mappingHashMap.get("TIMEZONE");
		if( mapping != null ) model.setTimezone(getValue(mapping), mapping);
		
		
		return model;		
	}
	
	private Object getValue(MappingInfo mappingInfo){
		
		JSONObject tempJson = rootObject;
		Object retValue = null;
		
		//mapping 정보를 가져온다.
		String key = mappingInfo.getMapping();
		
		//mapping 정보를  parsing 한다.
		String path[] = key.split(SEPERATOR);
		if( path != null && path.length > 0){
			
			//각 path 에 대허서 check			
			int count = 0;
			for( String pathKey : path){				
				
				String keyItems[] = pathKey.split(TYPE_SEPERATOR);
				
				if( keyItems!=null){
					if( keyItems.length == 1 ){
						//단일 Item 이다.
						if( count >= path.length -1){
							//마지막 자료이면 Value 이다.
							retValue = tempJson.get(keyItems[0]);
							
						}else {
							tempJson = (JSONObject)tempJson.get(keyItems[0]);
						}
						
					}else if( keyItems.length > 1 ) {
						//2개 이상이면 배열 정보이다.
						int index = Integer.parseInt(keyItems[1]); 						
						JSONArray jsonArray = (JSONArray)tempJson.get(keyItems[0]);
						
						if( jsonArray == null || jsonArray.isEmpty()) return null;
						
						if( count >= path.length -1){
							//마지막 자료이면 Value 이다.
							retValue = jsonArray.get(index);
						}else {						
							tempJson = (JSONObject)jsonArray.get(index);
						}
						
					}
					
				}
				count++;				
			}
			return retValue;
			
		}else{
			//mapping 정보가 올바르지 않음.
			return null;
		}
	}	

}
