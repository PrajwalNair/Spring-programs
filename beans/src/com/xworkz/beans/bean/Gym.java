package com.xworkz.beans.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Gym {
	@Autowired
	private String gymName;
	@Autowired
	private double gymFees;
	@Autowired
	private GymTrainer gymTrainer;
	
	public String getGymName() {
		return gymName;
	}
	
	public double getGymFees() {
		return gymFees;
	}
	
	public void display() {
		System.out.println(gymTrainer.getGymTrainerName());
		System.out.println(gymTrainer.getGymTrainerAge());
	}

}
