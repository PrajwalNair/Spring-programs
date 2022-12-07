package com.xworkz.obstruction.repository;

import com.xworkz.obstruction.entity.MilitaryEntity;

public class MilitaryRepositoryImpl implements MilitaryRepository {

	@Override
	public boolean save(MilitaryEntity entity) {
		System.out.println(getClass().getSimpleName());
		return true;
	}

}
