package com.xworkz.soil.entity;

import org.springframework.stereotype.Component;

@Component
public class Wire {

	public Wire() {
		System.out.println(getClass().getSimpleName());
	}

	public void passesCurrent() {
		System.out.println("Wire is passing current");
	}

}
