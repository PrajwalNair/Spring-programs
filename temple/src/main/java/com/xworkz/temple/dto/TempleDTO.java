package com.xworkz.temple.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "temple")
@NamedQuery(name = "findByGod", query = "select alia from TempleDTO alia where alia.mainGod=:gd")
public class TempleDTO implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotNull
	@NotEmpty
	@Length(min = 3, max = 50)
	private String name;
	@NotNull
	@NotEmpty
	@Length(min = 3, max = 50)
	private String location;
	@NotNull
	@NotEmpty
	@Length(min = 3, max = 50)
	private String mainGod;
	private int pincode;
	private double fees;
	private double openTime;
	private double closeTime;

	public TempleDTO(@NotNull @NotEmpty @Length(min = 3, max = 50) String name,
			@NotNull @NotEmpty @Length(min = 3, max = 50) String location,
			@NotNull @NotEmpty @Length(min = 3, max = 50) String mainGod, int pincode, double fees, double openTime,
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
