package com.xworkz.beans.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	@Autowired
	private String laptopBrand;
	@Autowired
	private double laptopPrice;
	@Autowired
	private GraphicCard graphicCard;
	
	public String getLaptopBrand() {
		return laptopBrand;
	}
	
	public double getLaptopPrice() {
		return laptopPrice;
	}
	
	public void display() {
		System.out.println(graphicCard.getGraphicCardBrand());
		System.out.println(graphicCard.getGraphicCardPrice());
	}
	
	
	

}
