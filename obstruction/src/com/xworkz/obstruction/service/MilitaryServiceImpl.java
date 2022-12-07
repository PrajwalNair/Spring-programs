package com.xworkz.obstruction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.obstruction.entity.MilitaryEntity;
import com.xworkz.obstruction.repository.MilitaryRepository;
@Component
public class MilitaryServiceImpl implements MilitaryService {
	
	@Autowired
	@Qualifier("militaryRepository")
	private MilitaryRepository repo;

	@Override
	public boolean validateAndSave(MilitaryEntity entity) {
		System.out.println(getClass().getSimpleName());
		repo.save(entity);
		return true;
	}

}
