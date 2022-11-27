package com.xworkz.beans.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Capacitor {
	@Autowired
	private int capacitorValue;
	@Autowired
	private String capacitorBrand;

	public int getCapacitorValue() {
		return capacitorValue;
	}

	public String getCapacitorBrand() {
		return capacitorBrand;
	}

}
