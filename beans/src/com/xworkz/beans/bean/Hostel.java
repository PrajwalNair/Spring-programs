package com.xworkz.beans.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Hostel {
	@Autowired
	private String hostelName;
	@Autowired
	private double hostelRent;
	@Autowired
	private HostelOwner hostelOwner;

	public String getHostelName() {
		return hostelName;
	}

	public double getHostelRent() {
		return hostelRent;
	}

	public void display() {
		System.out.println(hostelOwner.getHostelOwnerName());
		System.out.println(hostelOwner.getHostelOwnerAge());
	}

}
