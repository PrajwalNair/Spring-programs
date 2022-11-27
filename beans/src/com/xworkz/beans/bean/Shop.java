package com.xworkz.beans.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Shop {
	@Autowired
	private String shopName;
	@Autowired
	private double shopRent;
	@Autowired
	private ShopOwner shopOwner;

	public String getShopName() {
		return shopName;
	}

	public double getShopRent() {
		return shopRent;
	}

	public void display() {
		System.out.println(shopOwner.getShopOwnerName());
		System.out.println(shopOwner.getShopOwnerAge());
	}

}
