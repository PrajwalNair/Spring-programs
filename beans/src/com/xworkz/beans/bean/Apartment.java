package com.xworkz.beans.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Apartment {
	@Autowired
	private String apartmentName;
	@Autowired
	private int noOfFloors;
	@Autowired
	private Lift lift;

	public String getApartmentName() {
		return apartmentName;
	}

	public int getNoOfFloors() {
		return noOfFloors;
	}

	public void display() {
		System.out.println(lift.getCapacity());
		System.out.println(lift.getDoorType());
	}

}
