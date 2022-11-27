package com.xworkz.beans.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Oyo {
	@Autowired
	private String oyoName;
	@Autowired
	private double oyoPrice;
	@Autowired
	private Customer customer;

	public String getOyoName() {
		return oyoName;
	}

	public double getOyoPrice() {
		return oyoPrice;
	}
	
	public void display() {
		System.out.println(customer.getCustomerName());
		System.out.println(customer.getNoOfCustomer());
	}

}
