package com.xworkz.soil.entity;

import org.springframework.stereotype.Component;

@Component
public class SoilEntity {

	public SoilEntity() {
		System.out.println("running the default constructor in soil class");
	}

	public void produceFood() {
		System.out.println("hepls plants to produce foods 1");
	}

}


