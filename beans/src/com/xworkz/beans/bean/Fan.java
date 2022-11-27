package com.xworkz.beans.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Fan {
	@Autowired
	private String brand;
	@Autowired
	private double fanPrice;
	@Autowired
	private Capacitor capacitor;
	
	public String getBrand() {
		return brand;
	}
	
	public double getFanPrice() {
		return fanPrice;
	}
	public void display() {
		System.out.println(capacitor.getCapacitorValue());
		System.out.println(capacitor.getCapacitorBrand());
	}

}
