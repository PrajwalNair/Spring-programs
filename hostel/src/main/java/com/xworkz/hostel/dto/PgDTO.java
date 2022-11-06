package com.xworkz.hostel.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PgDTO {
	@Value("Malla")
	String name;
	@Value("Dharwad")
	String location;
	@Autowired
	HostelDTO dto;
	
	
	public PgDTO() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "PgDTO [name=" + name + ", location=" + location + ", dto=" + dto + "]";
	}
	
	

}
