package com.xworkz.beans.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Ship {
	@Autowired
	private String company;
	@Autowired
	private int noOfPassengers;
	@Autowired
	private Captain captain;

	public String getCompany() {
		return company;
	}

	public int getNoOfPassengers() {
		return noOfPassengers;
	}

	public void display() {
		System.out.println(captain.getCaptainName());
		System.out.println(captain.getCaptainAge());
	}

}
