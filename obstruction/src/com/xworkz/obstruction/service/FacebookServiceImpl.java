package com.xworkz.obstruction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.obstruction.entity.FacebookEntity;
import com.xworkz.obstruction.repository.FacebookRepository;

@Component
public class FacebookServiceImpl implements FacebookService {
	@Autowired
	@Qualifier("facebookRepository")
	private FacebookRepository repo;

	@Override
	public boolean validateAndSave(FacebookEntity entity) {
		System.out.println(getClass().getSimpleName());
		repo.save(entity);
		return true;
	}

}
