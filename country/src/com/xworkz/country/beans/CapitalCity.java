package com.xworkz.country.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CapitalCity {
	@Value("Delhi")
	private String name;
	@Value("true")
	private boolean capital;

	@Override
	public String toString() {
		return "CapitalCity [name=" + name + ", capital=" + capital + "]";
	}

}
