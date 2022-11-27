package com.xworkz.beans.bean;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Airport {
	@Autowired
	private String country;
	@Autowired
	private String state;
	@Autowired
	private Employees employees;
	
	public String getCountry() {
		return country;
	}
	
	public String getState() {
		return state;
	}
	
	public void display() {
		System.out.println(employees.getNoOfAccountants());
		System.out.println(employees.getNoOfSecurities());
	}
	
	

}
