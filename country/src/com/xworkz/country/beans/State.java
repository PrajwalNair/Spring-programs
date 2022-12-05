package com.xworkz.country.beans;

import org.springframework.stereotype.Component;

@Component
public class State {
	private String name;
	private int population;
	private String capital;
	private int noOfDistrict;
	private double area;
	private String cmName;
	private String primaryLanguage;

	public State() {
		// TODO Auto-generated constructor stub
	}

	public State(String name, int population, String capital, int noOfDistrict, double area, String cmName,
			String primaryLanguage) {
		super();
		this.name = name;
		this.population = population;
		this.capital = capital;
		this.noOfDistrict = noOfDistrict;
		this.area = area;
		this.cmName = cmName;
		this.primaryLanguage = primaryLanguage;
	}

	@Override
	public String toString() {
		return "State [name=" + name + ", population=" + population + ", capital=" + capital + ", noOfDistrict="
				+ noOfDistrict + ", area=" + area + ", cmName=" + cmName + ", primaryLanguage=" + primaryLanguage + "]";
	}

}
