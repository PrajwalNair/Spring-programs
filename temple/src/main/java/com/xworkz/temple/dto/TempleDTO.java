package com.xworkz.temple.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "temple")
public class TempleDTO implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String location;
	private String mainGod;
	private int pincode;
	private double fees;
	private double openTime;
	private double closeTime;

	public TempleDTO(String name, String location, String mainGod, int pincode, double fees, double openTime,
			double closeTime) {
		super();
		this.name = name;
		this.location = location;
		this.mainGod = mainGod;
		this.pincode = pincode;
		this.fees = fees;
		this.openTime = openTime;
		this.closeTime = closeTime;
	}

}
