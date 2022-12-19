package com.xworkz.chappal.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.chappal.entity.ChappalEntity;
import com.xworkz.chappal.repository.ChappalRepository;

@Component
public class ChappalServiceImpl implements ChappalService {
	@Autowired
	private ChappalRepository repo;

	@Override
	public boolean validateAndSave(ChappalEntity entity) {
		System.out.println("service method");
		ValidatorFactory buildDefaultValidatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = buildDefaultValidatorFactory.getValidator();
		Set<ConstraintViolation<ChappalEntity>> validate = validator.validate(entity);
		if (validate.size() > 0) {
			System.out.println("data is not saved fix the errors");
		} else {
			System.out.println("data ia valid and saved");
			repo.save(entity);
		}
		return true;
	}

	@Override
	public Optional<List<ChappalEntity>> findByBrand(String brand) {

		return repo.findByBrand(brand);
	}

}
