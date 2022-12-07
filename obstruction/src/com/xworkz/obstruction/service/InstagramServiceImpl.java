package com.xworkz.obstruction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.obstruction.entity.InstagramEntity;
import com.xworkz.obstruction.repository.InstagramRepository;

@Component
public class InstagramServiceImpl implements InstagramService {
	@Autowired
	@Qualifier("instagramRepository")
	private InstagramRepository repo;

	@Override
	public boolean validateAndSave(InstagramEntity entity) {
		System.out.println(getClass().getSimpleName());
		repo.save(entity);
		return false;
	}

}
