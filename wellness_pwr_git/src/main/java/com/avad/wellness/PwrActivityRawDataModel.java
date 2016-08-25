package com.avad.wellness;

public class PwrActivityRawDataModel {
	
	String provider_id;	
	String provider_description;
	int starttime;
	int endtime;
	int step;
	double distance; //단위 meter
	int activity_time;
	int intese_active_time;
	int moderate_active_time;
	int soft_active_time;
	int sedentary_time;
	int longest_active_time;
	double calories;
	double burn_calories;
	int floors;
	double latitude,longitude;
	String location_name;
	String timezone;
	
	public String getProvider_id() {
		return provider_id;
	}
	public void setProvider_id(String provider_id) {
		this.provider_id = provider_id;
	}
	public String getProvider_description() {
		return provider_description;
	}
	public void setProvider_description(String provider_description) {
		this.provider_description = provider_description;
	}
	public int getStarttime() {
		return starttime;
	}
	public void setStarttime(int starttime) {
		this.starttime = starttime;
	}
	public int getEndtime() {
		return endtime;
	}
	public void setEndtime(int endtime) {
		this.endtime = endtime;
	}
	public int getStep() {
		return step;
	}
	public void setStep(int step) {
		this.step = step;
	}
	
	/**
	 * value 를 값을 typeInfo 를 참고하여 저장
	 * @param value
	 * @param typeInfo
	 */
	public void setStep(Object value, MappingInfo typeInfo){
		
		if( value instanceof Long){			
			this.step = ((Long)value).intValue();			
		}else if( value instanceof Integer){	
			this.step = ((Integer)value).intValue();
		}	
				
	}
	
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	public void setDistance(Object value, MappingInfo typeInfo){
		if( value instanceof Long){			
			this.distance = ((Long)value).doubleValue();			
		}else if( value instanceof Integer){	
			this.distance = ((Integer)value).doubleValue();
		}else if( value instanceof Double){
			this.distance = ((Double)value).doubleValue();
		}else if( value instanceof Float){
			this.distance = ((Float)value).doubleValue();
		}		
	}	
	
	
	public int getActivity_time() {
		return activity_time;
	}
	public void setActivity_time(int activity_time) {
		this.activity_time = activity_time;
	}
	public void setActivity_time(Object value, MappingInfo typeInfo){
		if( value instanceof Long){			
			this.activity_time = ((Long)value).intValue();			
		}else if( value instanceof Integer){	
			this.activity_time = ((Integer)value).intValue();
		}else if( value instanceof Double){
			this.activity_time = ((Double)value).intValue();
		}else if( value instanceof Float){
			this.activity_time = ((Float)value).intValue();
		}
	}
	public int getIntese_active_time() {
		return intese_active_time;
	}	
	public void setIntese_active_time(int intese_active_time) {
		this.intese_active_time = intese_active_time;
	}
	public void setIntese_active_time(Object value, MappingInfo typeInfo){
		if( value instanceof Long){			
			this.intese_active_time = ((Long)value).intValue();			
		}else if( value instanceof Integer){	
			this.intese_active_time = ((Integer)value).intValue();
		}else if( value instanceof Double){
			this.intese_active_time = ((Double)value).intValue();
		}else if( value instanceof Float){
			this.intese_active_time = ((Float)value).intValue();
		}
	}
	
	public int getModerate_active_time() {
		return moderate_active_time;
	}
	public void setModerate_active_time(int moderate_active_time) {
		this.moderate_active_time = moderate_active_time;
	}
	public void setModerate_active_time(Object value, MappingInfo typeInfo){
		if( value instanceof Long){			
			this.moderate_active_time = ((Long)value).intValue();			
		}else if( value instanceof Integer){	
			this.moderate_active_time = ((Integer)value).intValue();
		}else if( value instanceof Double){
			this.moderate_active_time = ((Double)value).intValue();
		}else if( value instanceof Float){
			this.moderate_active_time = ((Float)value).intValue();
		}
	}
	public int getSoft_active_time() {
		return soft_active_time;
	}
	public void setSoft_active_time(int soft_active_time) {
		this.soft_active_time = soft_active_time;
	}
	public void setSoft_active_time(Object value, MappingInfo typeInfo){
		if( value instanceof Long){			
			this.soft_active_time = ((Long)value).intValue();			
		}else if( value instanceof Integer){	
			this.soft_active_time = ((Integer)value).intValue();
		}else if( value instanceof Double){
			this.soft_active_time = ((Double)value).intValue();
		}else if( value instanceof Float){
			this.soft_active_time = ((Float)value).intValue();
		}
	}
	public int getSedentary_time() {
		return sedentary_time;
	}
	public void setSedentary_time(int sedentary_time) {
		this.sedentary_time = sedentary_time;
	}
	public void setSedentary_time(Object value, MappingInfo typeInfo){
		if( value instanceof Long){			
			this.sedentary_time = ((Long)value).intValue();			
		}else if( value instanceof Integer){	
			this.sedentary_time = ((Integer)value).intValue();
		}else if( value instanceof Double){
			this.sedentary_time = ((Double)value).intValue();
		}else if( value instanceof Float){
			this.sedentary_time = ((Float)value).intValue();
		}
	}
	public int getLongest_active_time() {
		return longest_active_time;
	}
	public void setLongest_active_time(int longest_active_time) {
		this.longest_active_time = longest_active_time;
	}
	public void setLongest_active_time(Object value, MappingInfo typeInfo){
		if( value instanceof Long){			
			this.longest_active_time = ((Long)value).intValue();			
		}else if( value instanceof Integer){	
			this.longest_active_time = ((Integer)value).intValue();
		}else if( value instanceof Double){
			this.longest_active_time = ((Double)value).intValue();
		}else if( value instanceof Float){
			this.longest_active_time = ((Float)value).intValue();
		}
	}
	public double getCalories() {
		return calories;
	}
	public void setCalories(double calories) {
		this.calories = calories;
	}
	public void setCalories(Object value, MappingInfo typeInfo){
		if( value instanceof Long){			
			this.calories = ((Long)value).doubleValue();			
		}else if( value instanceof Integer){	
			this.calories = ((Integer)value).doubleValue();
		}else if( value instanceof Double){
			this.calories = ((Double)value).doubleValue();
		}else if( value instanceof Float){
			this.calories = ((Float)value).doubleValue();
		}
	}
	public double getBurn_calories() {
		return burn_calories;
	}
	public void setBurn_calories(double burn_calories) {
		this.burn_calories = burn_calories;
	}
	public void setBurn_calories(Object value, MappingInfo typeInfo){
		if( value instanceof Long){			
			this.burn_calories = ((Long)value).doubleValue();			
		}else if( value instanceof Integer){	
			this.burn_calories = ((Integer)value).doubleValue();
		}else if( value instanceof Double){
			this.burn_calories = ((Double)value).doubleValue();
		}else if( value instanceof Float){
			this.burn_calories = ((Float)value).doubleValue();
		}
	}
	public int getFloors() {
		return floors;
	}
	public void setFloors(int floors) {
		this.floors = floors;
	}
	public void setFloors(Object value, MappingInfo typeInfo){
		if( value instanceof Long){			
			this.floors = ((Long)value).intValue();			
		}else if( value instanceof Integer){	
			this.floors = ((Integer)value).intValue();
		}else if( value instanceof Double){
			this.floors = ((Double)value).intValue();
		}else if( value instanceof Float){
			this.floors = ((Float)value).intValue();
		}
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public void setLatitude(Object value, MappingInfo typeInfo){
		if( value instanceof Long){			
			this.latitude = ((Long)value).doubleValue();			
		}else if( value instanceof Integer){	
			this.latitude = ((Integer)value).doubleValue();
		}else if( value instanceof Double){
			this.latitude = ((Double)value).doubleValue();
		}else if( value instanceof Float){
			this.latitude = ((Float)value).doubleValue();
		}
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public void setLongitude(Object value, MappingInfo typeInfo){
		if( value instanceof Long){			
			this.longitude = ((Long)value).doubleValue();			
		}else if( value instanceof Integer){	
			this.longitude = ((Integer)value).doubleValue();
		}else if( value instanceof Double){
			this.longitude = ((Double)value).doubleValue();
		}else if( value instanceof Float){
			this.longitude = ((Float)value).doubleValue();
		}
	}
	public String getLocation_name() {
		return location_name;
	}
	public void setLocation_name(String location_name) {
		this.location_name = location_name;
	}
	public void setLocation_name(Object value, MappingInfo typeInfo){
		if( value instanceof String)
			this.location_name = (String)value;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public void setTimezone(Object value, MappingInfo typeInfo){
		if( value instanceof String)
			this.timezone = (String)value;
	}
	
	

}
