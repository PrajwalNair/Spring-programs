package com.xworkz.obstruction.repository;

import org.springframework.stereotype.Component;

import com.xworkz.obstruction.entity.FacebookEntity;

@Component
public class FacebookRepositoryImpl implements FacebookRepository {

	@Override
	public boolean save(FacebookEntity entity) {
		System.out.println(getClass().getSimpleName());
		return true;
	}

}
