package com.xworkz.busstand.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

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
	@NotNull
	@NotEmpty
	@Length(min = 3, max = 50)
	private String name;
	private int noOfBusses;
	@NotNull
	@NotEmpty
	@Length(min = 3, max = 50)
	private String location;
	private int noOfPlatform;
	private int noOfShop;
	@NotNull
	@NotEmpty
	@Length(min = 3, max = 50)
	private String city;

	public BusStandDTO(@NotNull @NotEmpty @Length(min = 3, max = 50) String name, int noOfBusses,
			@NotNull @NotEmpty @Length(min = 3, max = 50) String location, int noOfPlatform, int noOfShop,
			@NotNull @NotEmpty @Length(min = 3, max = 50) String city) {
		super();
		this.name = name;
		this.noOfBusses = noOfBusses;
		this.location = location;
		this.noOfPlatform = noOfPlatform;
		this.noOfShop = noOfShop;
		this.city = city;
	}

}
