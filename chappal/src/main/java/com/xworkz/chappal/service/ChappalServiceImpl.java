package com.xworkz.chappal.service;

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
		
		return repo.save(entity);
	}

}
