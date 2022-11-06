package com.xworkz.hostel.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RoomDTO {
	@Value("${name}")
	String name;
	@Value("${location}")
	String location;

	public RoomDTO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "RoomDTO [name=" + name + ", location=" + location + "]";
	}
	
}
