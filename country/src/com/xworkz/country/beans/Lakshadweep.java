package com.xworkz.country.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Lakshadweep {
	@Value("Lakshadweep")
	private String name;
	@Value("32")
	private double area;
	@Value("Shri Praful patel")
	private String governorName;
	@Value("64473")
	private int population;

	@Override
	public String toString() {
		return "Lakshadweep [name=" + name + ", area=" + area + ", governorName=" + governorName + ", population="
				+ population + "]";
	}

}
