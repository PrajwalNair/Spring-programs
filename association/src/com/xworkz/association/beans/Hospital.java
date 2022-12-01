package com.xworkz.association.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Hospital {
	private String name;
	private double rating;
	private String location;
	@Autowired
	@Qualifier("hospitalCountry")
	private String country;
	@Autowired
	private Ambulance ambulance;

	public Hospital(String name, double rating) {
		super();
		this.name = name;
		this.rating = rating;
	}
	@Value("btm")
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getName() {
		return name;
	}
	
	public double getRating() {
		return rating;
	}
	
	public String getLocation() {
		return location;
	}
	
	public String getCountry() {
		return country;
	}
	public void display() {
		System.out.println(ambulance.getType());
		System.out.println(ambulance.getNoPlate());
		System.out.println(ambulance.getPatient());
	}
	
	

}
