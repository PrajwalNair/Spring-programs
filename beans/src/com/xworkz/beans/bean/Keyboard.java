package com.xworkz.beans.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Keyboard {
	@Autowired
	private String keyBoardBrand;
	@Autowired
	private int keyBoardPrice;
	@Autowired
	private Cell cell;
	
	public String getKeyBoardBrand() {
		return keyBoardBrand;
	}
	
	
	public int getKeyBoardPrice() {
		return keyBoardPrice;
	}
	
	public void display() {
		System.out.println(cell.getCellBrand());
		System.out.println(cell.getCellPrice());
	}

}
