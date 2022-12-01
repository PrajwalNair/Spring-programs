package com.xworkz.association.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Court {
	private String type;
	@Value("karnataka")
	private String state;
	private String location;
	@Autowired
	private Judge judge;

	public Court(@Value("manoj") String type) {
		super();
		this.type = type;
	}
	@Value("hubli")
	public void setLocation(String location) {
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "Court [type=" + type + ", state=" + state + ", location=" + location + ", judge=" + judge + "]";
	}
	public String getType() {
		return type;
	}
	
	public String getState() {
		return state;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void display() {
		System.out.println(judge.getName());
		System.out.println(judge.getAge());
		System.out.println(judge.getSalary());
		System.out.println(judge.getExperience());
		System.out.println(judge.getNationality());
	}

}
