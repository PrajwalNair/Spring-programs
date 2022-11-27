package com.xworkz.beans.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Institute {
	@Autowired
	private String instituteName;
	@Autowired
	private double instituteRating;
	@Autowired
	private Trainer trainer;

	public Institute() {
		System.out.println(getClass().getSimpleName());
	}

	public String getInstituteName() {
		return instituteName;
	}

	public double getInstituteRating() {
		return instituteRating;
	}

	public void display() {
		System.out.println(trainer.getTrainerName());
		System.out.println(trainer.getTrainerAge());
	}

}
