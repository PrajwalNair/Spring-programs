package com.xworkz.chappal.entity;

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
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "chappal")
public class ChappalEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotNull
	@NotEmpty
	@Length(min = 3, max = 50)
	private String brand;
	private int price;
	@NotNull
	@NotEmpty
	@Length(min = 3, max = 50)
	private String color;
	private int size;
	@NotNull
	@NotEmpty
	@Length(min = 1, max = 7)
	private String gender;

	public ChappalEntity(@NotNull @NotEmpty @Length(min = 3, max = 50) String brand, int price,
			@NotNull @NotEmpty @Length(min = 3, max = 50) String color, int size,
			@NotNull @NotEmpty @Length(min = 1, max = 7) String gender) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.size = size;
		this.gender = gender;
	}

}
