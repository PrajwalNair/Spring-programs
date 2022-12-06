package com.xworkz.country.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UnionTerritories{
//	@Autowired
//	private Lakshadweep lakshadeep;
//	@Autowired
//	private AndamanAndNicobar andamanAndaaNicobar;
	
//	@Value("Lakshadweep")
	private String name;
//	@Value("32")
	private double area;
//	@Value("Shri Praful patel")
	private String governorName;
//	@Value("64473")
	private int population;
	
	
	public UnionTerritories() {
		// TODO Auto-generated constructor stub
	}
	
	public UnionTerritories(String name, double area, String governorName, int population) {
	super();
	this.name = name;
	this.area = area;
	this.governorName = governorName;
	this.population = population;
}




	@Override
	public String toString() {
		return "UnionTerritories [name=" + name + ", area=" + area + ", governorName=" + governorName + ", population="
				+ population + "]";
	}
	
//	@Override
//	public String toString() {
//		return "UnionTerritories [lakshadeep=" + lakshadeep + ", andamanAndaaNicobar=" + andamanAndaaNicobar + "]";
//	}
	
	

	

}
