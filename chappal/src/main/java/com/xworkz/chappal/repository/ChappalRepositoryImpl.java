package com.xworkz.chappal.repository;

import org.springframework.stereotype.Component;

import com.xworkz.chappal.entity.ChappalEntity;

@Component
public class ChappalRepositoryImpl implements ChappalRepository {

	@Override
	public boolean save(ChappalEntity entity) {
		System.out.println("repository method");
		return true;
	}

}
