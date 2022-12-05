package com.xworkz.country.enums;

public enum Type {

	PERSON("person"), PLACE("place");
	
	private String values;
	
	private Type(String values) {
		this.values=values;
	}
	
	public String getValues() {
		return values;
	}
	
	

}
