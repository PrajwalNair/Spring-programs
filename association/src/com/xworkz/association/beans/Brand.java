package com.xworkz.association.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Brand {
	private String name;
	private int price;
	@Value("true")
	private Boolean caution;

	public Brand(@Value("budweiser") String name) {
		super();
		this.name = name;
	}
	@Value("200")
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public Boolean getCaution() {
		return caution;
	}
	
	
	
	
}
