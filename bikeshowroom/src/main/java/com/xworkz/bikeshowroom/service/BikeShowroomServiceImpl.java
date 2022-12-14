package com.xworkz.bikeshowroom.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.bikeshowroom.dto.BikeShowroomDTO;
import com.xworkz.bikeshowroom.repository.BikeShowroomRepository;

@Component
public class BikeShowroomServiceImpl implements BikeShowroomService {

	@Autowired
	private BikeShowroomRepository repo;

	@Override
	public boolean validateAndSave(BikeShowroomDTO dto) {
		System.out.println("service method");
		ValidatorFactory buildDefaultValidatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = buildDefaultValidatorFactory.getValidator();
		Set<ConstraintViolation<BikeShowroomDTO>> validate = validator.validate(dto);
		if(validate.size()>0) {
			System.out.println("data is not saved fix the errors");
		}else {
			System.out.println("data ia valid and saved");
			repo.save(dto);
		}
		
		return true;
	}

}
