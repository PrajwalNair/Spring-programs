package com.xworkz.obstruction.repository;

import org.springframework.stereotype.Component;

import com.xworkz.obstruction.entity.OmegleEntity;

@Component
public class OmegleRepositoryImpl implements OmegleRepository {

	@Override
	public boolean save(OmegleEntity entity) {
		System.out.println(getClass().getSimpleName());
		return false;
	}

}
