package com.xworkz.criminal.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.criminal.dto.CriminalDTO;
import com.xworkz.criminal.repository.CriminalRepository;

@Service
public class CriminalServiceImpl implements CriminalService {
	@Autowired
	private CriminalRepository repo;

	@Override
	public boolean validateAndSave(CriminalDTO dto) {
		System.out.println("Validate and save method is running");
		ValidatorFactory buildDefaultValidatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = buildDefaultValidatorFactory.getValidator();
		Set<ConstraintViolation<CriminalDTO>> validate = validator.validate(dto);
		if (validate.size() > 0) {
			System.out.println("Errors in the validations please fix it");
		} else {
			System.out.println("All data is validated and can be saved");
			this.repo.save(dto);
		}
		return true;
	}

//	@Override
//	public Optional<List<CriminalDTO>> findByName(String name) {
//		// TODO Auto-generated method stub
//		return repo.findByName(name);
//	}
//
//	@Override
//	public Optional<List<CriminalDTO>> findByJailName(String jailName) {
//		// TODO Auto-generated method stub
//		return repo.findByJailName(jailName);
//	}

	@Override
	public Optional<List<CriminalDTO>> findByNameAndJailName(String name, String jailName) {
		
		
		return repo.findByNameAndJailName(name, jailName);
	}

}
