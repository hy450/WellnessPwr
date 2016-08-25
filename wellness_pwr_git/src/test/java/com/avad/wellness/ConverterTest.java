package com.avad.wellness;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ConverterTest extends TestCase {
	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ConverterTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( ConverterTest.class );
    }


    public void testConvertStep()
    {    	
    	JSONParser parser = new JSONParser();
    	Object obj;
		try {
			obj = parser.parse( new FileReader("C:\\Users\\Administrator\\workspace\\wellness\\fitbit_today_acdtivity.json"));
		
	    	JSONObject jsonObject = (JSONObject)obj;
	    	
	    	Map <String,MappingInfo> mappingHashMap;
	    	mappingHashMap = new HashMap<String,MappingInfo>();
	    	
	    	MappingInfo mappinginfo = new MappingInfo("summary/steps","integer","step");
	    	mappingHashMap.put("STEP", mappinginfo);
	    	
	    	Converter converter = new Converter(jsonObject, mappingHashMap);
	    	
	    	PwrActivityRawDataModel model = converter.convert();
	    	
	    	if( model == null) assertTrue(false);
	    	
	    	assertEquals(11197, model.getStep());

	    	
	    	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(false);
		}  	
        
    }
    
    public void testConvertDistance()
    {    	
    	JSONParser parser = new JSONParser();
    	Object obj;
		try {
			obj = parser.parse( new FileReader("C:\\Users\\Administrator\\workspace\\wellness\\fitbit_today_acdtivity.json"));
		
	    	JSONObject jsonObject = (JSONObject)obj;
	    	
	    	Map <String,MappingInfo> mappingHashMap;
	    	mappingHashMap = new HashMap<String,MappingInfo>(); 	

	    	
	    	MappingInfo mappinginfo1 = new MappingInfo("summary/distances-0/distance","double","Km");
	    	mappingHashMap.put("DISTANCE", mappinginfo1);
	    	
	    	Converter converter = new Converter(jsonObject, mappingHashMap);
	    	
	    	PwrActivityRawDataModel model = converter.convert();
	    	
	    	if( model == null) assertTrue(false);    	

	    	
	    	assertEquals(7.91,model.getDistance());
	    	
	    	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(false);
		}  	
        
    }
    
    public void testFitbitConvertAll(){
    	JSONParser parser = new JSONParser();
    	Object obj;
    	Object mapping;
		try {
			obj = parser.parse( new FileReader("C:\\Users\\Administrator\\workspace\\wellness\\fitbit_today_acdtivity.json"));
			mapping = parser.parse( new FileReader("C:\\Users\\Administrator\\workspace\\wellness\\fitbit_activity_mapping.json"));
			
			JSONObject inputSourceObject = (JSONObject)obj;
			JSONObject mappingObject = (JSONObject)mapping;
			
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
			
			Converter converter = new Converter(inputSourceObject, mappingHashMap);
			PwrActivityRawDataModel model = converter.convert();	    	
	    	if( model == null) assertTrue(false);    	
	    	
	    	assertEquals(11197, model.getStep());
	    	assertEquals(7.91,model.getDistance());	    	
	    	assertEquals(911.0,model.getBurn_calories());
	    	assertEquals(2349.0,model.getCalories());
	    	assertEquals(64,model.getIntese_active_time());
	    	assertEquals(9,model.getModerate_active_time());
	    	assertEquals(84,model.getSoft_active_time());
	    	assertEquals(1075,model.getSedentary_time());    	
	    	
	    	
			
		}catch( Exception e){
			e.printStackTrace();
			assertTrue(false);			
		}
    	
    }

}
