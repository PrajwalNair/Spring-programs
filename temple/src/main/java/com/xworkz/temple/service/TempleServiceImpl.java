package com.xworkz.temple.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.temple.dto.TempleDTO;
import com.xworkz.temple.repository.TempleRepository;

@Component
public class TempleServiceImpl implements TempleService {

	@Autowired
	private TempleRepository repo;

	@Override
	public boolean validateAndSave(TempleDTO dto) {
		System.out.println("service method");
		ValidatorFactory buildDefaultValidatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = buildDefaultValidatorFactory.getValidator();
		Set<ConstraintViolation<TempleDTO>> validate = validator.validate(dto);
		if (validate.size() > 0) {
			System.out.println("data is not saved fix the errors");
		} else {
			System.out.println("data ia valid and saved");
			repo.save(dto);
		}
		return true;
	}

	@Override
	public Optional<List<TempleDTO>> findByGod(String god) {

		return repo.findByGod(god);
	}

}
