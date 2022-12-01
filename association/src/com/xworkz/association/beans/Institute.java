package com.xworkz.association.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Institute {
	private String name;
	private int since;
	private String location;
	@Autowired
	private double rating;
	@Autowired
	private Founder founder;

	public Institute(String name, int since) {
		super();
		this.name = name;
		this.since = since;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getName() {
		return name;
	}
	
	public String getLocation() {
		return location;
	}
	
	public int getSince() {
		return since;
	}
	 
	public double getRating() {
		return rating;
	}
	
	public void display() {
		System.out.println(founder.getName());
		System.out.println(founder.getAge());
		System.out.println(founder.getGender());
	}
	

}
