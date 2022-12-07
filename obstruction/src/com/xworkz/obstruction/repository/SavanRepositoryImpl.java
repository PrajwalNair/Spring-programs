package com.xworkz.obstruction.repository;

import org.springframework.stereotype.Component;

import com.xworkz.obstruction.entity.SavanEntity;

@Component
public class SavanRepositoryImpl implements SavanRepository {

	@Override
	public boolean save(SavanEntity entity) {
		System.out.println(getClass().getSimpleName());
		return false;
	}

}
