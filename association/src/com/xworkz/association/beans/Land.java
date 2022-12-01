package com.xworkz.association.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Land {
	private String type;
	private double area;
	private String location;
	@Autowired
	@Qualifier("landCountry")
	private String country;
	@Autowired
	private Farmer farmer;

	public Land(String type, double area) {
		super();
		this.type = type;
		this.area = area;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getType() {
		return type;
	}
	
	public double getArea() {
		return area;
	}
	
	public String getLocation() {
		return location;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void display() {
		System.out.println(farmer.getName());
		System.out.println(farmer.getAge());
		System.out.println(farmer.getNationality());
	}

}
