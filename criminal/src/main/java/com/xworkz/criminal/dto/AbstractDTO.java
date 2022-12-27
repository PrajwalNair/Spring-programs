package com.xworkz.criminal.dto;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class AbstractDTO implements Serializable {
	@NotNull
	@NotEmpty
	@Size(min = 3, max = 50)
	private String createdBy = "Prajwal";
	private LocalDate createdDate = LocalDate.now();

}
