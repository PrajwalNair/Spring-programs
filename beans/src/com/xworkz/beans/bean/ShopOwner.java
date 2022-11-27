package com.xworkz.beans.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShopOwner {
	@Autowired
	private String shopOwnerName;
	@Autowired
	private int shopOwnerAge;

	public String getShopOwnerName() {
		return shopOwnerName;
	}

	public int getShopOwnerAge() {
		return shopOwnerAge;
	}

}
