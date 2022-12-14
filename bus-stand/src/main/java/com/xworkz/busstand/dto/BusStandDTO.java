package com.xworkz.busstand.dto;

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
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "busstand")
public class BusStandDTO implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int noOfBusses;
	private String location;
	private int noOfPlatform;
	private int noOfShop;
	private String city;

	public BusStandDTO(String name, int noOfBusses, String location, int noOfPlatform, int noOfShop, String city) {
		super();
		this.name = name;
		this.noOfBusses = noOfBusses;
		this.location = location;
		this.noOfPlatform = noOfPlatform;
		this.noOfShop = noOfShop;
		this.city = city;
	}

}
