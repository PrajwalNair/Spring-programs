package com.xworkz.association.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.association.beans.Hospital;
import com.xworkz.association.beans.Institute;
import com.xworkz.association.beans.Judge;
import com.xworkz.association.beans.Land;
import com.xworkz.association.beans.MRP;
import com.xworkz.association.beans.Temple;

@Configuration
@ComponentScan("com.xworkz")
public class SpringConfig {
	
	@Bean
	public Judge judge() {
		Judge judge = new Judge("akshay", 45);
		return judge;
	}
	
	@Bean
	public double experience() {
		return 8.5;
	}
	
	@Bean
	public String nationality() {
		return "indian";
	}
	
	@Bean
	public Temple temple() {
		Temple temple =new Temple("Dharavathi", "hubli");
		return temple;
	}
	
	@Bean
	public String god() {
		return "hanuman";
	}
	
	@Bean
	public Hospital hospital() {
		Hospital hospital = new Hospital("jayadeva", 4.5);
		return hospital;
	}
		
	@Bean
	public String hospitalCountry() {
		return "India";
	}
	
	@Bean
	public Land land() {
		Land land = new Land("agriculture", 300000.00);
		return land;
	}
	
	@Bean
	public String landCountry() {
		return "india";
	}
	
	@Bean
	public Institute institute() {
		Institute institute = new Institute("xyz", 2016);
		return institute;
	}
	
	@Bean
	public double rating() {
		return 4.9;
	}
	
	@Bean
	public MRP mrp() {
		MRP mrp = new MRP("BTM", "Suhas");
		return mrp;
	}
	
	@Bean
	public double closeTime() {
		return 12.00;
	}
	
	

}
