package com.xworkz.beans.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Hospital {

	@Autowired
	private String hospitalName;
	@Autowired
	private double hospitalRating;
	@Autowired
	private Founder founder;
	
	public Hospital() {
		System.out.println(getClass().getSimpleName());
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public double getHospitalRating() {
		return hospitalRating;
	}

	public void display() {
		System.out.println(founder.getFounderName());
		System.out.println(founder.getFounderAge());
	}

}
