package com.xworkz.obstruction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.obstruction.entity.SavanEntity;
import com.xworkz.obstruction.repository.SavanRepository;

@Component
public class SavanServiceImpl implements SavanService {
	@Autowired
	@Qualifier("savanRepository")
	private SavanRepository repo;

	@Override
	public boolean validateAndSave(SavanEntity entity) {
		System.out.println(getClass().getSimpleName());
		repo.save(entity);
		return true;
	}

}
