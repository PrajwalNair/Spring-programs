package com.xworkz.beans.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GraphicCard {
	@Autowired
	private String graphicCardBrand;
	@Autowired
	private double graphicCardPrice;
	
	public String getGraphicCardBrand() {
		return graphicCardBrand;
	}
	
	public double getGraphicCardPrice() {
		return graphicCardPrice;
	}

}
