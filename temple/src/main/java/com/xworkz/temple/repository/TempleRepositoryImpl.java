package com.xworkz.temple.repository;

import org.springframework.stereotype.Component;

import com.xworkz.temple.dto.TempleDTO;

@Component
public class TempleRepositoryImpl implements TempleRepository {

	@Override
	public boolean save(TempleDTO dto) {
		System.out.println("repository method");
		return true;
	}

}
