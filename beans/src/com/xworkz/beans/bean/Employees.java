package com.xworkz.beans.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employees {
	@Autowired
	private int noOfAccountants;
	@Autowired
	private int noOfSecurities;

	public int getNoOfAccountants() {
		return noOfAccountants;
	}

	public int getNoOfSecurities() {
		return noOfSecurities;
	}

}
