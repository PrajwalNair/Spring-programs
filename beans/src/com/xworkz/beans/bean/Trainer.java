package com.xworkz.beans.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Trainer {
	@Autowired
	private String trainerName;
	@Autowired
	private int trainerAge;

	public String getTrainerName() {
		return trainerName;
	}

	public int getTrainerAge() {
		return trainerAge;
	}

}
