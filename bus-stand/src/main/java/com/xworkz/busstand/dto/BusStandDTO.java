package com.xworkz.busstand.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BusStandDTO implements Serializable {
	private String name;
	private int noOfBusses;
	private String location;
	private int noOfPlatform;
	private int noOfShop;
	private String city;

}
