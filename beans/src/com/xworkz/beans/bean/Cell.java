package com.xworkz.beans.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cell {
	@Autowired
	private String cellBrand;
	@Autowired
	private int cellPrice;

	public String getCellBrand() {
		return cellBrand;
	}

	public int getCellPrice() {
		return cellPrice;
	}

}
