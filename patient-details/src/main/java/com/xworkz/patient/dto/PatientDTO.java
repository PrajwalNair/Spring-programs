package com.xworkz.patient.dto;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "patient")
@NamedQuery(name = "findByName", query = "select alia from PatientDTO alia where alia.name=:nm")
@NamedQuery(name = "findByAgeGreaterThan", query = "select alia from PatientDTO alia where alia.age>:ag ")
@NamedQuery(name = "findByEmail", query = "select alia from PatientDTO alia where alia.email=:em")
@NamedQuery(name = "findByMobileNo", query = "select alia from PatientDTO alia where alia.mobileNo=:mb")
public class PatientDTO extends AbstractDTO {
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
	@Email
	private String email;
	private int age;
	private long mobileNo;

	private String gender;
	@NotNull
	@NotEmpty
	private String idProof;
	@NotNull
	@NotEmpty
	private String idValue;
	@NotNull
	@NotEmpty
	private String bplCard;
	@NotNull
	@NotEmpty
	private String insurance;
	private String fileName;

	public PatientDTO(String createdBy, LocalDate createdDate,
			@NotNull @NotEmpty @Length(min = 3, max = 50) String name,
			@NotNull @NotEmpty @Length(min = 3, max = 50) @Email String email, int age, long mobileNo, String gender,
			@NotNull @NotEmpty String idProof, @NotNull @NotEmpty String idValue, @NotNull @NotEmpty String bplCard,
			@NotNull @NotEmpty String insurance, String file) {
		super(createdBy, createdDate);
		this.name = name;
		this.email = email;
		this.age = age;
		this.mobileNo = mobileNo;
		this.gender = gender;
		this.idProof = idProof;
		this.idValue = idValue;
		this.bplCard = bplCard;
		this.insurance = insurance;
		this.fileName = file;
	}

}
