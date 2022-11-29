package com.xworkz.beans.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mouse {
	@Autowired
	private String mouseBrand;
	@Autowired
	private int mousePrice;
	@Autowired
	private Cell cell;

	public String getMouseBrand() {
		return mouseBrand;
	}

	public int getMousePrice() {
		return mousePrice;
	}

	public void display() {
		System.out.println(cell.getCellBrand());
		System.out.println(cell.getCellPrice());
	}

}
