package com.xworkz.busstand.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.busstand.dto.BusStandDTO;
import com.xworkz.busstand.repository.BusStandRepository;

@Component
public class BusStandServiceImpl implements BusStandService {
	@Autowired
	private BusStandRepository repo;

	@Override
	public boolean validateAndSave(BusStandDTO dto) {
		System.out.println("service method");
		ValidatorFactory buildDefaultValidatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = buildDefaultValidatorFactory.getValidator();
		Set<ConstraintViolation<BusStandDTO>> validate = validator.validate(dto);
		if(validate.size()>0) {
			System.out.println("data is not saved fix the errors");
		}else {
			System.out.println("data ia valid and saved");
			repo.save(dto);
		}
		return true;
	}

	@Override
	public Optional<List<BusStandDTO>> findByName(String name) {
		return repo.findByName(name);
	}

}
