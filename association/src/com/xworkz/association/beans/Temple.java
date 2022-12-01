package com.xworkz.association.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Temple {
	private String name;
	private String location;
	private int pincode;
	@Autowired
	private String god;
	@Autowired
	private Preist preist;

	public Temple(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	@Value("580021")
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	public String getName() {
		return name;
	}
	
	public String getLocation() {
		return location;
	}
	
	public int getPincode() {
		return pincode;
	}
	
	public String getGod() {
		return god;
	}

	public void display() {
		System.out.println(preist.getName());
		System.out.println(preist.getAge());
		System.out.println(preist.getExperience());
	}
}
