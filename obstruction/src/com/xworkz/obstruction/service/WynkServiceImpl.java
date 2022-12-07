package com.xworkz.obstruction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.obstruction.entity.WynkEntity;
import com.xworkz.obstruction.repository.WynkRepository;

@Component
public class WynkServiceImpl implements WynkService {
	@Autowired
	@Qualifier("wynkRepository")
	private WynkRepository repo;

	@Override
	public boolean validateAndSave(WynkEntity entity) {
		System.out.println(getClass().getSimpleName());
		repo.save(entity);
		return true;
	}

}
