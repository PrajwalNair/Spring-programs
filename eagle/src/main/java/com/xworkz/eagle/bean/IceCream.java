package com.xworkz.eagle.bean;

import org.springframework.stereotype.Component;

@Component
public class IceCream {
	public IceCream() {
		System.out.println(getClass().getSimpleName());
	}

}
