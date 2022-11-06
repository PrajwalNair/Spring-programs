package com.xworkz.hostel.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HostelDTO {
	@Value("BCM Hostel")
	String name;
	@Value("Hubli")
	String location;
	
	public HostelDTO() {
		System.out.println("created"+this.getClass().getSimpleName());
	}

	@Override
	public String toString() {
		return "HostelDTO [name=" + name + ", location=" + location + "]";
	}

	public HostelDTO( String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	//@Value("BCM Hostel")
	public void setName(String name) {
		this.name = name;
	}
	//@Value("Hubli")
	public void setLocation(String location) {
		this.location = location;
	}
	

}
