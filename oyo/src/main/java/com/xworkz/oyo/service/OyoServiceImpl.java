package com.xworkz.oyo.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.oyo.dto.OyoDTO;
import com.xworkz.oyo.repository.OyoRepository;

@Component
public class OyoServiceImpl implements OyoService {
	@Autowired
	private OyoRepository repo;

	@Override
	public boolean validateAndSave(OyoDTO dto) {
		System.out.println("service method");
		ValidatorFactory buildDefaultValidatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = buildDefaultValidatorFactory.getValidator();
		Set<ConstraintViolation<OyoDTO>> validate = validator.validate(dto);
		if(validate.size()>0) {
			System.out.println("data is not saved fix the errors");
		}else {
			System.out.println("data ia valid and saved");
			repo.save(dto);
		}
		return true;
	}

}
