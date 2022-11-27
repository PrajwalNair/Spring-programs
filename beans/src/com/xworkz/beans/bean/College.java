package com.xworkz.beans.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class College {
	@Autowired
	private String collegeName;
	@Autowired
	private double collegeRating;
	@Autowired
	private Student student;
	
	public String getCollegeName() {
		return collegeName;
	}
	
	public double getCollegeRating() {
		return collegeRating;
	}
	
	public void display() {
		System.out.println(student.getStudentName());
		System.out.println(student.getStudentAge());
	}

}
