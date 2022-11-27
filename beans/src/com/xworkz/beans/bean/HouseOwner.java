package com.xworkz.beans.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HouseOwner {
	@Autowired
	private String houseOwnerName;
	@Autowired
	private int houseOwnerAge;

	public String getHouseOwnerName() {
		return houseOwnerName;
	}

	public int getHouseOwnerAge() {
		return houseOwnerAge;
	}

}
