package com.xworkz.beans.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Train {
	@Autowired
	private int noOfBoggies;
	@Autowired
	private int noOfPassenger;

	public int getNoOfPassenger() {
		return noOfPassenger;
	}

	public int getNoOfBoggies() {
		return noOfBoggies;
	}

}
