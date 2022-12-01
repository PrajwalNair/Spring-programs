package com.xworkz.association.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Preist {
	private String name;
	@Value("35")
	private int age;
	private double experience;

	public Preist(@Value("kiran") String name) {
		super();
		this.name = name;
	}
	@Value("10")
	public void setExperience(double experience) {
		this.experience = experience;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getExperience() {
		return experience;
	}

}
