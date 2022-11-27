package com.xworkz.beans.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class House {
	@Autowired
	private String houseName;
	@Autowired
	private double houseCost;
	@Autowired
	private HouseOwner houseOwner;

	public House() {
		System.out.println(getClass().getSimpleName());
	}

	public String getHouseName() {
		return houseName;
	}

	public double getHouseCost() {
		return houseCost;
	}

	public void display() {
		System.out.println(houseOwner.getHouseOwnerName());
		System.out.println(houseOwner.getHouseOwnerAge());
	}

}
