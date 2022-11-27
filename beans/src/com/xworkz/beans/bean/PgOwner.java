package com.xworkz.beans.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class PgOwner {
	@Autowired
	private String pgOwnerName;
	@Autowired
	private int pgOwnerAge;

	public String getPgOwnerName() {
		return pgOwnerName;
	}

	public int getPgOwnerAge() {
		return pgOwnerAge;
	}
	
	

}
