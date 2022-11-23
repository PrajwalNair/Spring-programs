package com.xworkz.soil.entity;

import org.springframework.stereotype.Component;

@Component
public class Apple {
	public Apple() {
		System.out.println(getClass().getSimpleName());
	}

	public void sweet() {
		System.out.println("apple is very sweet");
	}

}
