package com.xworkz.soil.entity;

import org.springframework.stereotype.Component;

@Component
public class Light {

	public Light() {
		System.out.println(getClass().getSimpleName());
	}

	public void brightness() {
		System.out.println("it gives light");
	}
}
