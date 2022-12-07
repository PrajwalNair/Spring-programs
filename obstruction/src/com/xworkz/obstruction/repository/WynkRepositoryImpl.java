package com.xworkz.obstruction.repository;

import org.springframework.stereotype.Component;

import com.xworkz.obstruction.entity.WynkEntity;

@Component
public class WynkRepositoryImpl implements WynkRepository {

	@Override
	public boolean save(WynkEntity entity) {
		System.out.println(getClass().getSimpleName());
		return false;
	}

}
