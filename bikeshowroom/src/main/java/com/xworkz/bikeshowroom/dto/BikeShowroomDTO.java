package com.xworkz.bikeshowroom.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "bikeshowroom")
@NamedQuery(name = "findByBrand", query = "select alia from BikeShowroomDTO alia where alia.brand=:bd")
public class BikeShowroomDTO implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotEmpty
	@NotEmpty
	@Length(min = 3, max = 50)
	private String brand;
	@NotEmpty
	@NotEmpty
	@Length(min = 3, max = 50)
	private String ownerName;
	@NotEmpty
	@NotEmpty
	@Length(min = 3, max = 50)
	private String location;
	@NotEmpty
	@NotEmpty
	@Length(min = 3, max = 50)
	private String ambassador;
	@NotEmpty
	@NotEmpty
	@Length(min = 3, max = 50)
	private String description;

	public BikeShowroomDTO(@NotEmpty @NotEmpty @Length(min = 3, max = 50) String brand,
			@NotEmpty @NotEmpty @Length(min = 3, max = 50) String ownerName,
			@NotEmpty @NotEmpty @Length(min = 3, max = 50) String location,
			@NotEmpty @NotEmpty @Length(min = 3, max = 50) String ambassador,
			@NotEmpty @NotEmpty @Length(min = 3, max = 50) String description) {
		super();
		this.brand = brand;
		this.ownerName = ownerName;
		this.location = location;
		this.ambassador = ambassador;
		this.description = description;
	}

}
