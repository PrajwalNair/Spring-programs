package com.xworkz.beans.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sim {
	@Autowired
	private String simCompany;
	@Autowired
	private String network;

	public String getSimCompany() {
		return simCompany;
	}

	public String getNetwork() {
		return network;
	}

}
