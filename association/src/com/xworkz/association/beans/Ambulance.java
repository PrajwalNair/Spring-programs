package com.xworkz.association.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Ambulance {
	private String type;
	@Value("KA 25 D 9908")
	private String noPlate;
	private Boolean patient;

	public Ambulance(@Value("TT") String type) {
		super();
		this.type = type;
	}
	@Value("true")
	public void setPatient(boolean patient) {
		this.patient = patient;
	}
	
	public String getType() {
		return type;
	}
	
	public String getNoPlate() {
		return noPlate;
	}
	
	public Boolean getPatient() {
		return patient;
	}

	

}
