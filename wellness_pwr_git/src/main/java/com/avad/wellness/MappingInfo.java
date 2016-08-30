package com.avad.wellness;

public class MappingInfo {
	
	String mapping;
	String type;
	String unit;
	String format;
	
	public MappingInfo(String mapping, String type, String unit, String format) {		
		this.mapping = mapping;
		this.type = type;
		this.unit = unit;
		this.format = format;
	}	
	
	public String getFormat() {
		return format;
	}
	
	public void setFormat(String format) {
		this.format = format;
	}

	public String getMapping() {
		return mapping;
	}
	public String getType() {
		return type;
	}
	public String getUnit() {
		return unit;
	}
	
	

}
