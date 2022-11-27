package com.xworkz.beans.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GymTrainer {
	@Autowired
	private String gymTrainerName;
	@Autowired
	private int gymTrainerAge;

	public String getGymTrainerName() {
		return gymTrainerName;
	}

	public int getGymTrainerAge() {
		return gymTrainerAge;
	}

}
