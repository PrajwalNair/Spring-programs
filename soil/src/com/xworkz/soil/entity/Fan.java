package com.xworkz.soil.entity;

import org.springframework.stereotype.Component;

@Component
public class Fan {

	public Fan() {
		System.out.println(getClass().getSimpleName());
	}

	public void rotates() {
		System.out.println("rotates the blade");
	}

}
