package com.xworkz.beans.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Owner {
	@Autowired
	private String ownerName;
	@Autowired
	private int age;
	
	public Owner() {
		System.out.println(getClass().getSimpleName());
	}

	public String getOwnerName() {
		return ownerName;
	}

	public int getAge() {
		return age;
	}
	
	
}
