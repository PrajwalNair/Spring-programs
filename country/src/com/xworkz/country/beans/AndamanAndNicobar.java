package com.xworkz.country.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AndamanAndNicobar {
	@Value("AndamanAndNicobar")
	private String name;
	@Value("8249")
	private double area;
	@Value("D K Joshi")
	private String governorName;
	@Value("434000")
	private int population;

	@Override
	public String toString() {
		return "AndamanAndNicobar [name=" + name + ", area=" + area + ", governorName=" + governorName + ", population="
				+ population + "]";
	}

}
