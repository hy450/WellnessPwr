package com.avad.wellness.indicator;

import org.json.simple.JSONObject;

public class ActIndicator {
	
	/**
	 * 1 등급: 좌식생활자(Sedentary): <5,000 steps/day 미만
	 * 2 등급: 활동부족(low active): 5000-7499 steps/day
	 * 3 등급: 다소 활동적(somewhat active): 7500-9999 steps/day
	 * 4 등급: 활동적(active): 10,000-12,499 steps/day:
	 * 5 등급: 상당히 활동적(highly active): >12,500 steps/day 이상
	 * @param step : steps/day 단위이고 이전주 평균치를 사용이 가능하다.
	 * @return
	 */
	public String getPhysicalActStage( int step) {
		String []DESCS = {"좌식생활자","활동부족","다소 활동적","활동적","상당히 활동적"};
		int []CODES = {0,1,2,3,4};		
		double LEVELS[] ={ 5000,7500,10000,12500};
		
		return convertIndicate(step,DESCS,CODES,LEVELS);
		
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

}
