package com.xworkz.abstraction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.xworkz.abstraction.annot.Prajwal;
import com.xworkz.abstraction.entity.TheatreEntity;
import com.xworkz.abstraction.repository.TheatreRepository;

@Prajwal
public class TheatreServiceImpl implements TheatreService {
	@Autowired
	@Qualifier("theatreRepository")
	private TheatreRepository repo;

	@Override
	public boolean validateAndSave(TheatreEntity entity) {
		System.out.println("theatre validate aagi save aagtha ide");
		repo.save(entity);
		return true;
	}

}
