package com.xworkz.association.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Judge {
	private String name;
	private int age;
	private double salary;
	@Autowired
	private double experience;
	@Autowired
	private String nationality;

	public Judge(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Value("100000")
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public double getExperience() {
		return experience;
	}
	
	public String getNationality() {
		return nationality;
	}

}
