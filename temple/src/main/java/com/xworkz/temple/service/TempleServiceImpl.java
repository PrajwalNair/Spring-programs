package com.xworkz.temple.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.temple.dto.TempleDTO;
import com.xworkz.temple.repository.TempleRepository;

@Component
public class TempleServiceImpl implements TempleService {

	@Autowired
	private TempleRepository repo;

	@Override
	public boolean validateAndSave(TempleDTO dto) {
		System.out.println("service method");

		return repo.save(dto);
	}

}
