package com.xworkz.association.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Founder {
	private String name;
	@Value("26")
	private int age;
	private char gender;

	public Founder(@Value("hanamant") String name) {
		super();
		this.name = name;
	}

	@Value("M")
	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public char getGender() {
		return gender;
	}

}
