package com.xworkz.beans.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Restaurent {
	@Autowired
	private String restaurentName;
	@Autowired
	private double restaurentRating;
	@Autowired
	private Owner owner;
	
	public String getRestaurentName() {
		return restaurentName;
	}
	
	public double getRestaurentRating() {
		return restaurentRating;
	}
	
	public void display() {
		System.out.println(owner.getOwnerName());
		System.out.println(owner.getAge());
	}

}
