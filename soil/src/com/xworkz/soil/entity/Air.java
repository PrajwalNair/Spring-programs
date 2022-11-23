package com.xworkz.soil.entity;

import org.springframework.stereotype.Component;

@Component
public class Air {

	public Air() {
		System.out.println(getClass().getSimpleName());
	}

	public void wind() {
		System.out.println("creates wind");
	}

}
