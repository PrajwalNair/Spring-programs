package com.xworkz.country.beans;

import org.springframework.stereotype.Component;

@Component
public class Education {
	private int id;
	private String university;
	private String branch;
	private int year;
	private String place;
	private int noOfBacklogs;
	private double percentage;
	private boolean passed;

	public Education() {
		System.out.println(getClass().getSimpleName());
	}

	public Education(int id, String university, String branch, int year, String place, int noOfBacklogs,
			double percentage, boolean passed) {
		super();
		this.id = id;
		this.university = university;
		this.branch = branch;
		this.year = year;
		this.place = place;
		this.noOfBacklogs = noOfBacklogs;
		this.percentage = percentage;
		this.passed = passed;
	}

	@Override
	public String toString() {
		return "Education [id=" + id + ", university=" + university + ", branch=" + branch + ", year=" + year
				+ ", place=" + place + ", noOfBacklogs=" + noOfBacklogs + ", percentage=" + percentage + ", passed="
				+ passed + "]";
	}

}
