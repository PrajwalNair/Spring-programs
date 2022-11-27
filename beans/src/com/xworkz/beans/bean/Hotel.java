package com.xworkz.beans.bean;

import org.springframework.beans.factory.annotation.Autowired;

//@Component
public class Hotel {
	@Autowired
	private String hotelName;
	@Autowired
	private double hotelRating;
	@Autowired
	private Owner owner;

	public Hotel() {
		System.out.println(getClass().getSimpleName());
	}

	public String getHotelName() {
		return hotelName;
	}

	public double getHotelRating() {
		return hotelRating;
	}

	public void display() {
		System.out.println(owner.getOwnerName());
		System.out.println(owner.getAge());
	}

}
