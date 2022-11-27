package com.xworkz.beans.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RailwayStation {
	@Autowired
	private String stationName;
	@Autowired
	private int noOfPlatforms;
	@Autowired
	private Train train;
	
	public String getStationName() {
		return stationName;
	}
	
	public int getNoOfPlatforms() {
		return noOfPlatforms;
	}
	
	public void display() {
		System.out.println(train.getNoOfBoggies());
		System.out.println(train.getNoOfPassenger());
	}
	

}
