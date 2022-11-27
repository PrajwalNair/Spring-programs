package com.xworkz.beans.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Helicopter {
	@Autowired
	private String pilotName;
	@Autowired
	private String color;
	@Autowired
	private Pilot pilot;

	public String getPilotName() {
		return pilotName;
	}

	public String getColor() {
		return color;
	}

	public void display() {
		System.out.println(pilot.getPilotName());
		System.out.println(pilot.getPilotAge());
	}

}
