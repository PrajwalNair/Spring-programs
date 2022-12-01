package com.xworkz.association.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Farmer {
	private String name;
	@Value("35")
	private int age;
	private String nationality;

	public Farmer(@Value("manoj") String name) {
		super();
		this.name = name;
	}
	@Value("indian")
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getNationality() {
		return nationality;
	}

}
