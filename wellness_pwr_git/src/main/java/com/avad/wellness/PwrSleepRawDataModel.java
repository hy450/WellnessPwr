package com.avad.wellness;

public class PwrSleepRawDataModel {
	int starttime;
	int sleep_duration;
	double sleep_efficiency;
	int awake_time;
	int asleep_time;
	int awake_count;
	int awake_duration;
	int light_sleep_time;
	int deep_sleep_time;
	int sleep_latency;
	String timezone;
	
	public int getStarttime() {
		return starttime;
	}
	public void setStarttime(int starttime) {
		this.starttime = starttime;
	}
	public int getSleep_duration() {
		return sleep_duration;
	}
	public void setSleep_duration(int sleep_duration) {
		this.sleep_duration = sleep_duration;
	}
	
	public void setSleep_duration(Object value, MappingInfo typeInfo){		
		if( value instanceof Long){			
			this.sleep_duration = ((Long)value).intValue();
		}else if( value instanceof Integer){	
			this.sleep_duration = ((Integer)value).intValue();
		}
		
		String unit_type = typeInfo.getUnit();
		this.sleep_duration = TypeConvert.convertSleepDuration(unit_type, this.sleep_duration);
		
		
	}
	
	public double getSleep_efficiency() {
		return sleep_efficiency;
	}
	public void setSleep_efficiency(double sleep_efficiency) {
		this.sleep_efficiency = sleep_efficiency;
	}
	public void setSleep_efficiency(Object value, MappingInfo typeInfo){
		if( value instanceof Long){			
			this.sleep_efficiency = ((Long)value).doubleValue();			
		}else if( value instanceof Integer){	
			this.sleep_efficiency = ((Integer)value).doubleValue();
		}else if( value instanceof Double){
			this.sleep_efficiency = ((Double)value).doubleValue();
		}else if( value instanceof Float){
			this.sleep_efficiency = ((Float)value).doubleValue();
		}		
	}	
	
	public int getAwake_time() {
		return awake_time;
	}
	public void setAwake_time(int awake_time) {
		this.awake_time = awake_time;
	}
	public void setAwake_time(Object value, MappingInfo typeInfo){		
		if( value instanceof Long){			
			this.awake_time = ((Long)value).intValue();			
		}else if( value instanceof Integer){	
			this.awake_time = ((Integer)value).intValue();
		}		
	}
	public int getAsleep_time() {
		return asleep_time;
	}
	public void setAsleep_time(int asleep_time) {
		this.asleep_time = asleep_time;
	}
	public void setAsleep_time(Object value, MappingInfo typeInfo){		
		if( value instanceof Long){			
			this.asleep_time = ((Long)value).intValue();			
		}else if( value instanceof Integer){	
			this.asleep_time = ((Integer)value).intValue();
		}else if( value instanceof String ){
			
			String unit_type = typeInfo.getUnit();
			if( unit_type.equals("date")){
				String dateformat = typeInfo.getFormat();
				if( dateformat == null || dateformat.isEmpty() ) return;
				this.asleep_time = TypeConvert.convertASleepTime(dateformat, (String)value);
			}			
		}
	}
	public int getAwake_count() {
		return awake_count;
	}
	public void setAwake_count(int awake_count) {
		this.awake_count = awake_count;
	}
	public void setAwake_count(Object value, MappingInfo typeInfo){		
		if( value instanceof Long){			
			this.awake_count = ((Long)value).intValue();			
		}else if( value instanceof Integer){	
			this.awake_count = ((Integer)value).intValue();
		}		
	}
	public int getAwake_duration() {
		return awake_duration;
	}
	public void setAwake_duration(int awake_duration) {
		this.awake_duration = awake_duration;
	}
	public void setAwake_duration(Object value, MappingInfo typeInfo){		
		if( value instanceof Long){			
			this.awake_duration = ((Long)value).intValue();			
		}else if( value instanceof Integer){	
			this.awake_duration = ((Integer)value).intValue();
		}		
	}
	public int getLight_sleep_time() {
		return light_sleep_time;
	}
	public void setLight_sleep_time(int light_sleep_time) {
		this.light_sleep_time = light_sleep_time;
	}
	public void setLight_sleep_time(Object value, MappingInfo typeInfo){		
		if( value instanceof Long){			
			this.light_sleep_time = ((Long)value).intValue();			
		}else if( value instanceof Integer){	
			this.light_sleep_time = ((Integer)value).intValue();
		}		
	}
	public int getDeep_sleep_time() {
		return deep_sleep_time;
	}
	public void setDeep_sleep_time(int deep_sleep_time) {
		this.deep_sleep_time = deep_sleep_time;
	}
	public void setDeep_sleep_time(Object value, MappingInfo typeInfo){		
		if( value instanceof Long){			
			this.deep_sleep_time = ((Long)value).intValue();			
		}else if( value instanceof Integer){	
			this.deep_sleep_time = ((Integer)value).intValue();
		}		
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public void setTimezone(Object value, MappingInfo typeInfo){		
		if( value instanceof String){			
			this.timezone = (String)value;			
		}
	}
	public int getSleep_latency() {
		return sleep_latency;
	}
	public void setSleep_latency(int sleep_latency) {
		this.sleep_latency = sleep_latency;
	}
	public void setSleep_latency(Object value, MappingInfo typeInfo){		
		if( value instanceof Long){			
			this.sleep_latency = ((Long)value).intValue();			
		}else if( value instanceof Integer){	
			this.sleep_latency = ((Integer)value).intValue();
		}		
	}

}
