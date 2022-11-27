package com.xworkz.beans.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Pg {
	@Autowired
	private String pgName;
	@Autowired
	private double pgRent;
	@Autowired
	private PgOwner pgOwner;

	public Pg() {
		System.out.println(getClass().getSimpleName());
	}

	public String getPgName() {
		return pgName;
	}

	public double getPgRent() {
		return pgRent;
	}

	public void display() {
		System.out.println(pgOwner.getPgOwnerName());
		System.out.println(pgOwner.getPgOwnerAge());
	}
}
