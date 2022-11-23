package com.xworkz.soil.entity;

import org.springframework.stereotype.Component;

@Component
public class Human {

	public Human() {
		System.out.println(getClass().getSimpleName());
	}

	public void survive() {
		System.out.println("human is surviving");
	}

}
