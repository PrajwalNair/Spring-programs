package com.xworkz.patient.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.patient.dto.PatientDTO;
import com.xworkz.patient.repository.PatientRepository;

@Component
public class PatientServiceImpl implements PatientService {
	@Autowired
	private PatientRepository repo;

	@Override
	public boolean validateAndSave(PatientDTO dto) {
		System.out.println("service method");
		
	
			return repo.save(dto);
		
		
		
	}

	@Override
	public Optional<List<PatientDTO>> findByName(String name) {
		
		if(name!=null) {
			System.out.println("data is present");
			return repo.findByName(name);
		}else {
			System.out.println("data is empty");
			return Optional.empty();
		}
		
	}

	@Override
	public Optional<List<PatientDTO>> findByAgeGreaterThan(int age) {
		if (age > 0 && age < 150) {
			System.out.println("Age is greater than 18 years");
			return repo.findByAgeGreaterThan(age);
		} else {
			System.out.println("Age should be greater than 18 years");
			return Optional.empty();
		}

	}

	@Override
	public boolean findByEmail(String email) {
		List<PatientDTO> findByEmail = repo.findByEmail(email);
		if(findByEmail!=null) {
			return false;
		}else {
			return true;
		}
		
	}

	@Override
	public boolean findByMobileNo(long mobileNo) {
		List<PatientDTO> findByMobileNo = repo.findByMobileNo(mobileNo);
		if(findByMobileNo!=null) {
			return false;
		}else {
			return true;
		}
	}

	

}
