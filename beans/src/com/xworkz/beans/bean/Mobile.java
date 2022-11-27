package com.xworkz.beans.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	@Autowired
	private String mobileBrand;
	@Autowired
	private double mobilePrice;
	@Autowired
	private Sim sim;

	public String getMobileBrand() {
		return mobileBrand;
	}

	public double getMobilePrice() {
		return mobilePrice;
	}

	public void display() {
		System.out.println(sim.getSimCompany());
		System.out.println(sim.getNetwork());
	}

}
