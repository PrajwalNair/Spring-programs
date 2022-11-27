package com.xworkz.beans.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class School {
	@Autowired
	private String schoolName;
	@Autowired
	private int since;
	@Autowired
	private Student student;

	public String getSchoolName() {
		return schoolName;
	}

	public int getSince() {
		return since;
	}

	public void display() {
		System.out.println(student.getStudentName());
		System.out.println(student.getStudentAge());
	}

}
