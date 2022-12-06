package com.xworkz.abstraction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.xworkz.abstraction.annot.Prajwal;
import com.xworkz.abstraction.entity.SimEntity;
import com.xworkz.abstraction.repository.SimRepository;

@Prajwal
public class SimServiceImpl implements SimService {
	@Autowired
	@Qualifier("SimRepository")
	private SimRepository repo;

	@Override
	public boolean validateAndSave(SimEntity entity) {
		System.out.println("sim validate aagi save aagtha ide");
		repo.save(entity);
		return false;
	}

}
