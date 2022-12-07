package com.xworkz.obstruction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.obstruction.entity.OmegleEntity;
import com.xworkz.obstruction.repository.OmegleRepository;

@Component
public class OmegleServiceImpl implements OmegleService {
	@Autowired
	@Qualifier("omegleRepository")
	private OmegleRepository repo;

	@Override
	public boolean validateAndSave(OmegleEntity entity) {
		System.out.println(getClass().getSimpleName());
		repo.save(entity);
		return false;
	}

}
