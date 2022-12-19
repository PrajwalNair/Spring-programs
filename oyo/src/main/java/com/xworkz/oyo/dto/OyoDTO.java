package com.xworkz.oyo.dto;

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
@Table(name = "oyo")
@NamedQuery(name = "findByLocation",query = "select alia from OyoDTO alia where alia.location=:lc")
public class OyoDTO implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotNull
	@NotEmpty
	@Length(min = 3, max = 50)
	private String location;
	@NotNull
	@NotEmpty
	@Length(min = 3, max = 50)
	private String state;
	@NotNull
	@NotEmpty
	@Length(min = 3, max = 50)
	private String customerName;
	private int age;
	private double fees;
	private int pincode;
	private long contactNo;
	private int noOfRooms;
	@NotNull
	@NotEmpty
	@Length(min = 2, max = 5)
	private String ac;
	@NotNull
	@NotEmpty
	@Length(min = 2, max = 5)
	private String nonAc;

	public OyoDTO(@NotNull @NotEmpty @Length(min = 3, max = 50) String location,
			@NotNull @NotEmpty @Length(min = 3, max = 50) String state,
			@NotNull @NotEmpty @Length(min = 3, max = 50) String customerName, int age, double fees, int pincode,
			long contactNo, int noOfRooms, @NotNull @NotEmpty @Length(min = 2, max = 5) String ac,
			@NotNull @NotEmpty @Length(min = 2, max = 5) String nonAc) {
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
