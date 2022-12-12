package com.xworkz.chappal.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChappalEntity {
	private String brand;
	private int price;
	private String color;
	private int size;
	private String gender;

}
