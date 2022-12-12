package com.xworkz.oyo.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OyoDTO implements Serializable {
	private String location;
	private String state;
	private String customerName;
	private int age;
	private double fees;
	private int pincode;
	private long contactNo;
	private int noOfRooms;
	private String ac;
	private String nonAc;

}
