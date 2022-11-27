package com.xworkz.beans.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Lift {
	@Autowired
	private int capacity;
	@Autowired
	private String doorType;

	public int getCapacity() {
		return capacity;
	}

	public String getDoorType() {
		return doorType;
	}

}
