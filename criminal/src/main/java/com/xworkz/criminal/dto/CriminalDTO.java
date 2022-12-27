package com.xworkz.criminal.dto;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "criminal")
@NamedQuery(name = "findByNameAndJailName", query = "select alia from CriminalDTO alia where "
		+ "(:nm is null or alia.name=:nm) or " + "(:jn is null or alia.jailName=:jn)")
//@NamedQuery(name = "findByName", query = "select alia from CriminalDTO alia where alia.name=:nm")
//@NamedQuery(name = "findByJailName", query = "select alia from CriminalDTO alia where alia.jailName=:jn")
public class CriminalDTO extends AbstractDTO implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotNull
	@NotEmpty
	@Size(min = 3, max = 50)
	private String name;
	@NotNull
	@NotEmpty
	@Size(min = 3, max = 50)
	private String crime;
	private int totalYearsAwarded;
	@NotNull
	@NotEmpty
	@Size(min = 3, max = 50)
	private String aliasName;
	@NotNull
	@NotEmpty
	@Size(min = 3, max = 50)
	private String description;
	@NotNull
	@NotEmpty
	@Size(min = 3, max = 50)
	private String jailName;
	private String fileName;
	private long fileSize;
	private String contentType;

	public CriminalDTO(@NotNull String createdBy, LocalDate createdDate,
			@NotNull @NotEmpty @Size(min = 3, max = 50) String name,
			@NotNull @NotEmpty @Size(min = 3, max = 50) String crime, int totalYearsAwarded,
			@NotNull @NotEmpty @Size(min = 3, max = 50) String aliasName,
			@NotNull @NotEmpty @Size(min = 3, max = 50) String description,
			@NotNull @NotEmpty @Size(min = 3, max = 50) String jailName, String fileName, long fileSize,
			String contentType) {
		super(createdBy, createdDate);
		this.name = name;
		this.crime = crime;
		this.totalYearsAwarded = totalYearsAwarded;
		this.aliasName = aliasName;
		this.description = description;
		this.jailName = jailName;
		this.fileName = fileName;
		this.fileSize = fileSize;
		this.contentType = contentType;
	}

}
