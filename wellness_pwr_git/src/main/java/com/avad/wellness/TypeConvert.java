package com.avad.wellness;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TypeConvert {
	
	public static int millisecondsToSeconds(int milliseconds){		
		return milliseconds / 1000;				
	}
	
	public static int minutesToSeconds(int minutes){		
		return minutes * 60;				
	}
	
	public static double mgTog(double mg){
		return mg / 1000;
	}
	
	public static double gTomg(double g){
		return g * 1000;
	}
	
	public static int convertSleepDuration(String unit_type, int input_val){		
		int ret_val = input_val;		
		switch(unit_type){
		case "milliseconds" :
			ret_val = TypeConvert.millisecondsToSeconds(input_val);
		break;
		case "minutes" :
			ret_val = TypeConvert.minutesToSeconds(input_val);
			break;
		}		
		return ret_val;		
	}
	
	public static int convertASleepTime(String date_format, String input_val){
		int timestamp_sec;
		
		SimpleDateFormat sdf = new SimpleDateFormat(date_format);
		Date date = null;
		try {
			date = sdf.parse(input_val);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
		
		return (int)(date.getTime() / 1000);
			
	}
	

}
