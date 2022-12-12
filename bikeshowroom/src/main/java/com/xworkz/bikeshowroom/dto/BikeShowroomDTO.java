package com.xworkz.bikeshowroom.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BikeShowroomDTO implements Serializable {
	private String brand;
	private String ownerName;
	private String location;
	private String ambassador;
	private String description;

}
