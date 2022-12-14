package com.xworkz.chappal.entity;

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
@Table(name = "chappal")
public class ChappalEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String brand;
	private int price;
	private String color;
	private int size;
	private String gender;

	public ChappalEntity(String brand, int price, String color, int size, String gender) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.size = size;
		this.gender = gender;
	}

}
