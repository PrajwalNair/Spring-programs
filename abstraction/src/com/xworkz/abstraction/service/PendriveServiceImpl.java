package com.xworkz.abstraction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.xworkz.abstraction.annot.Prajwal;
import com.xworkz.abstraction.entity.PendriveEntity;
import com.xworkz.abstraction.repository.PendriveRepository;

@Prajwal
public class PendriveServiceImpl implements PendriveService {
	@Autowired
	@Qualifier("pendriveRepository")
	private PendriveRepository repo;

	@Override
	public boolean validateAndSave(PendriveEntity entity) {
		System.out.println("pendrive validate aagtha ide");
		repo.save(entity);
		return true;
	}

}
