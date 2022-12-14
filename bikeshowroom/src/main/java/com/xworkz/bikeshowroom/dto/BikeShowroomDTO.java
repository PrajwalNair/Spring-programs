package com.xworkz.bikeshowroom.dto;

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
@Table(name = "bikeshowroom")
public class BikeShowroomDTO implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String brand;
	private String ownerName;
	private String location;
	private String ambassador;
	private String description;

	public BikeShowroomDTO(String brand, String ownerName, String location, String ambassador, String description) {
		super();
		this.brand = brand;
		this.ownerName = ownerName;
		this.location = location;
		this.ambassador = ambassador;
		this.description = description;
	}

}
