package com.xworkz.country.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class President {
	@Autowired
	@Qualifier("presidentName")
	private Name name;
	@Value("64")
	private int age;
	@Autowired
	@Qualifier("presidentSalary")
	private Salary salary;
	@Value("N/A")
	private String expertise;
	@Autowired
	@Qualifier("presidentEducation")
	private Education education;

	public President() {
		System.out.println(getClass().getSimpleName());
	}
	
	public President(Name name, int age, Salary salary, String expertise, Education education) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.expertise = expertise;
		this.education = education;
	}

	@Override
	public String toString() {
		return "President [name=" + name + ", age=" + age + ", salary=" + salary + ", expertise=" + expertise
				+ ", education=" + education + "]";
	}

}
