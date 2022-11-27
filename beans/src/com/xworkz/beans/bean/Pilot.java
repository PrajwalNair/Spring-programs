package com.xworkz.beans.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Pilot {
	@Autowired
	private String pilotName;
	@Autowired
	private int pilotAge;

	public String getPilotName() {
		return pilotName;
	}

	public int getPilotAge() {
		return pilotAge;
	}

}
