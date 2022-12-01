package com.xworkz.association.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class MRP {
	private String area;
	private String ownerName;
	private double openTime;
	@Autowired
	private double closeTime;
	@Autowired
	private Brand brand;

	public MRP(String area, String ownerName) {
		super();
		this.area = area;
		this.ownerName = ownerName;
	}
	@Value("10.00")
	public void setOpenTime(double openTime) {
		this.openTime = openTime;
	}

	public String getArea() {
		return area;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public double getOpenTime() {
		return openTime;
	}
	
	public double getCloseTime() {
		return closeTime;
	}
	
	public void display() {
		System.out.println(brand.getName());
		System.out.println(brand.getPrice());
		System.out.println(brand.getCaution());
	}
}
