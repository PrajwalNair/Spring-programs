package com.xworkz.beans.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	@Autowired
	private String customerName;
	@Autowired
	private int noOfCustomer;
	
	public String getCustomerName() {
		return customerName;
	}
	
	public int getNoOfCustomer() {
		return noOfCustomer;
	}

}
