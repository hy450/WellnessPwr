package com.avad.wellness.indicator;

import org.json.simple.JSONObject;

public class NutrientIntakeStandardIndicator {
	
	/**
	 * 표8 참고
	 * {
	 * 		"code" : -2,
	 * 	    "desc" : "매우부족"
	 * }
	 * 탄수화물 평가 지수 정보 return
	 * @return json type string
	 */
	public String getCarbohydrateIndicate(double percentage){
		String []DESCS = {"매우 부족","부족","적절","과잉","매우 과잉"};
		int []CODES = {-2,-1,0,1,2};
		double LEVELS[] ={ 45,55,65.1,70.1};
		
		int i=0;
		for( ; i < LEVELS.length; i++ ){
			if( percentage < LEVELS[i] ) break;
		}
		
		JSONObject json = new JSONObject();
		json.put("code", CODES[i]);
		json.put("desc", DESCS[i]);
		
		//System.out.println(json);
		
		return json.toJSONString();
		
	}
	
	/**
	 * 단백질	
	 * @param percentage
	 * @return 단백질 평가지수 json string
	 */
	public String getProteinIndicate( double percentage){
		String []DESCS = {"매우 부족","부족","적절","과잉","매우 과잉"};
		int []CODES = {-2,-1,0,1,2};
		double LEVELS[] ={ 5,7,20.1,30.1};
		
		return convertIndicate(percentage, DESCS,CODES,LEVELS);
		
	}
	
	/**
	 * 총 지방
	 * @param percentage
	 * @return
	 */
	public String getTotalFatIndicate( double percentage ){
		String []DESCS = {"매우 부족","부족","적절","과잉","매우 과잉"};
		int []CODES = {-2,-1,0,1,2};
		double LEVELS[] ={ 10,15,30.1,35.1};
		
		return convertIndicate(percentage, DESCS,CODES,LEVELS);
		
	}
	
	/**
	 * 불포화 지방
	 * @param percentage
	 * @return
	 */
	public String getUnsaturatedFatIndicate( double percentage ){
		String []DESCS = {"매우 부족","부족","적절","충분","과잉"};
		int []CODES = {-2,-1,0,1,2};
		double LEVELS[] ={ 2,5,11.1,25.1};
		
		return convertIndicate(percentage, DESCS,CODES,LEVELS);
		
	}
	
	/**
	 * 비타민 D
	 * @param ug
	 * @return
	 */
	public String getVitaminDIndicate( double ug ){
		String []DESCS = {"매우 부족","부족","적절","과잉"};
		int []CODES = {-2,-1,0,1};
		double LEVELS[] ={ 2,5.01,100.01};
		
		return convertIndicate(ug, DESCS,CODES,LEVELS);
		
	}
	
	/**
	 * 비타민 C
	 * @param ug
	 * @return
	 */
	public String getVitaminCIndicate( double mg ){
		String []DESCS = {"매우 부족","부족","적절","충분", "과잉"};
		int []CODES = {-2,-1,0,1,2};
		double LEVELS[] ={ 37.5,75,201,2000.1};
		
		return convertIndicate(mg, DESCS,CODES,LEVELS);		
	}
	
	/**
	 * 비타민 C
	 * @param ug
	 * @return
	 */
	public String getSodiumIndicate( double mg ){
		String []DESCS = {"적절","경계","과잉"};
		int []CODES = {-2,-1,0};
		double LEVELS[] ={ /*500,*/2001,4000.1};
		
		return convertIndicate(mg, DESCS,CODES,LEVELS);		
	}
	
	/**
	 * 칼슘
	 * @param mg
	 * @return
	 */
	public String getCalciumIndicate( double mg ){
		String []DESCS = {"매우 부족","부족","적절","충분", "과잉"};
		int []CODES = {-2,-1,0,1,2};
		double LEVELS[] ={ 300,630,1001,2501};
		
		return convertIndicate(mg, DESCS,CODES,LEVELS);		
	}
	
	/**
	 * 총 열량 지수
	 * @param kcal
	 * @param age
	 * @param isMan 남성이면 true 여성이면 false
	 * @return
	 */
	public String getTotalCalorieIndicate( double kcal , int age, boolean isMan){
		String []DESCS = {"매우 부족","부족","적절","과잉","매우 과잉"};
		int []CODES = {-2,-1,0,1,2};
		double LEVELS[]= null;
		
		if( age < 19 || age > 64 ) return convertErrorIndicate();
		
		if( age >= 19 && age < 30 ){
			if( isMan) {
				double TEMP_LEVELS[] = {1600,2100,2601,3101};
				LEVELS = TEMP_LEVELS;
			}else {
				double TEMP_LEVELS[] = {1100,1600,2101,2601};
				LEVELS = TEMP_LEVELS;				
			}
		}else if( age >= 30 && age < 50 ){
			if( isMan) {
				double TEMP_LEVELS[] = {1400,1900,2400,2901};
				LEVELS = TEMP_LEVELS;
			}else {
				double TEMP_LEVELS[] = {900,1400,1900,2401};
				LEVELS = TEMP_LEVELS;				
			}
			
		}else if( age >= 50 && age < 65) {
			if( isMan) {
				double TEMP_LEVELS[] = {1200,1700,2200,2701};
				LEVELS = TEMP_LEVELS;
			}else {
				double TEMP_LEVELS[] = {800,1300,1800,2301};
				LEVELS = TEMP_LEVELS;				
			}			
		}		
		return convertIndicate(kcal, DESCS,CODES,LEVELS);
	}
	
	/**
	 * 철분 지수
	 * @param mg
	 * @param age
	 * @param isMan 남성이면 true 여성이면 false
	 * @return
	 */
	public String getIronIndicate( double mg , int age, boolean isMan){
		String []DESCS = {"매우 부족","부족","적절","과잉","매우 과잉"};
		int []CODES = {-2,-1,0,1,2};
		double LEVELS[]= null;
		
		if( age < 19 || age > 64 ) return convertErrorIndicate();
		
		if( age >= 19 && age < 30 ){
			if( isMan) {
				double TEMP_LEVELS[] = {7,8,01,4.5,55.01};
				LEVELS = TEMP_LEVELS;
			}else {
				double TEMP_LEVELS[] = {6,11,45.01,55.01};
				LEVELS = TEMP_LEVELS;				
			}
		}else if( age >= 30 && age < 50 ){
			if( isMan) {
				double TEMP_LEVELS[] = {7,8,01,4.5,55.01};
				LEVELS = TEMP_LEVELS;
			}else {
				double TEMP_LEVELS[] = {6,11,45.01,55.01};
				LEVELS = TEMP_LEVELS;				
			}
			
		}else if( age >= 50 && age < 65) {
			if( isMan) {
				double TEMP_LEVELS[] = {5,7,45.01,55.01};
				LEVELS = TEMP_LEVELS;
			}else {
				double TEMP_LEVELS[] = {5,6,45.01,55.01};
				LEVELS = TEMP_LEVELS;				
			}			
		}		
		return convertIndicate(mg, DESCS,CODES,LEVELS);
	}
	
	
	public String getWaterIndicate( double ml , int age,boolean isMan ){
		String []DESCS = {"부족","충분"};
		int []CODES = {0,1};
		double LEVELS[] = null;
		
		if( age < 19 || age > 64 ) return convertErrorIndicate();
		
		if( age >= 19 && age < 30 ){
			if( isMan) {
				double TEMP_LEVELS[] = {2600};
				LEVELS = TEMP_LEVELS;
			}else {
				double TEMP_LEVELS[] = {2100};
				LEVELS = TEMP_LEVELS;				
			}
		}else if( age >= 30 && age < 50 ){
			if( isMan) {
				double TEMP_LEVELS[] = {2500};
				LEVELS = TEMP_LEVELS;
			}else {
				double TEMP_LEVELS[] = {2000};
				LEVELS = TEMP_LEVELS;				
			}
			
		}else if( age >= 50 && age < 65) {
			if( isMan) {
				double TEMP_LEVELS[] = {2200};
				LEVELS = TEMP_LEVELS;
			}else {
				double TEMP_LEVELS[] = {1900};
				LEVELS = TEMP_LEVELS;				
			}			
		}		
		return convertIndicate(ml, DESCS,CODES,LEVELS);
		
	}
	
	public String getSugarIndicate( double g , int age,boolean isMan ){
		String []DESCS = {"적절","개선필요","위험"};
		int []CODES = {0,1,2};
		double LEVELS[] = null;
		
		if( age < 19 || age > 64 ) return convertErrorIndicate();
		
		if( age >= 19 && age < 30 ){
			if( isMan) {
				double TEMP_LEVELS[] = {65,97.5};
				LEVELS = TEMP_LEVELS;
			}else {
				double TEMP_LEVELS[] = {52.5,78.75};
				LEVELS = TEMP_LEVELS;				
			}
		}else if( age >= 30 && age < 50 ){
			if( isMan) {
				double TEMP_LEVELS[] = {60,90};
				LEVELS = TEMP_LEVELS;
			}else {
				double TEMP_LEVELS[] = {47.5,71.25};
				LEVELS = TEMP_LEVELS;				
			}
			
		}else if( age >= 50 && age < 65) {
			if( isMan) {
				double TEMP_LEVELS[] = {55,82.5};
				LEVELS = TEMP_LEVELS;
			}else {
				double TEMP_LEVELS[] = {45,67.5};
				LEVELS = TEMP_LEVELS;				
			}			
		}		
		return convertIndicate(g, DESCS,CODES,LEVELS);
		
	}
	
	
	private String convertIndicate(double percentage, String desc[] , int []codes, double levels[]){
		int i=0;
		for( ; i < levels.length; i++ ){			
			if( percentage < levels[i] ) break;
		}
		JSONObject json = new JSONObject();
		json.put("code", codes[i]);
		json.put("desc", desc[i]);
		
		return json.toJSONString();
		
	}
	
	private String convertErrorIndicate(){
		
		JSONObject json = new JSONObject();
		json.put("code", -99);
		json.put("desc", "평가 불가");		
		
		return json.toJSONString();
		
	}

}
