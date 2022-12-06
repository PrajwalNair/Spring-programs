package com.xworkz.abstraction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.xworkz.abstraction.annot.Prajwal;
import com.xworkz.abstraction.entity.ATMEntity;
import com.xworkz.abstraction.repository.ATMRepository;

@Prajwal
public class ATMServiceImpl implements ATMService {

	@Autowired
	@Qualifier("atmRepository")
	ATMRepository repo;

	@Override
	public boolean validateAndSave(ATMEntity entity) {
		System.out.println("validate haagi save methos call maadtha ide");
		repo.save(entity);
		return true;
	}

}
