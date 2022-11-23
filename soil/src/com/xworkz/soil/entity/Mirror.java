package com.xworkz.soil.entity;

import org.springframework.stereotype.Component;

@Component
public class Mirror {

	public Mirror() {
		System.out.println(getClass().getSimpleName());
	}

	public void reflects() {
		System.out.println("mirror reflects");
	}

}
