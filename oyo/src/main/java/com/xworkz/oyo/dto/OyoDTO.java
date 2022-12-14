package com.xworkz.oyo.dto;

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
@Table(name = "oyo")
public class OyoDTO implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String location;
	private String state;
	private String customerName;
	private int age;
	private double fees;
	private int pincode;
	private long contactNo;
	private int noOfRooms;
	private String ac;
	private String nonAc;

	public OyoDTO(String location, String state, String customerName, int age, double fees, int pincode, long contactNo,
			int noOfRooms, String ac, String nonAc) {
		super();
		this.location = location;
		this.state = state;
		this.customerName = customerName;
		this.age = age;
		this.fees = fees;
		this.pincode = pincode;
		this.contactNo = contactNo;
		this.noOfRooms = noOfRooms;
		this.ac = ac;
		this.nonAc = nonAc;
	}

}
