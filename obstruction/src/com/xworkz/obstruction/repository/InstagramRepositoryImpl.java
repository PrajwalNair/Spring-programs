package com.xworkz.obstruction.repository;

import org.springframework.stereotype.Component;

import com.xworkz.obstruction.entity.InstagramEntity;

@Component
public class InstagramRepositoryImpl implements InstagramRepository {

	@Override
	public boolean save(InstagramEntity entity) {
		System.out.println(getClass().getSimpleName());
		return true;
	}

}
