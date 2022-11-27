package com.xworkz.beans.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Founder {
	@Autowired
	private String founderName;
	@Autowired
	private int founderAge;

	public Founder() {
		System.out.println(getClass().getSimpleName());
	}

	public String getFounderName() {
		return founderName;
	}

	public int getFounderAge() {
		return founderAge;
	}

}
