package com.xworkz.temple.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TempleDTO implements Serializable {
	private String name;
	private String location;
	private String mainGod;
	private int pincode;
	private double fees;
	private double openTime;
	private double closeTime;

}
