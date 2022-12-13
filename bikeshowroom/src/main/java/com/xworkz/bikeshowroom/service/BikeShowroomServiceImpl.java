package com.xworkz.bikeshowroom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.bikeshowroom.dto.BikeShowroomDTO;
import com.xworkz.bikeshowroom.repository.BikeShowroomRepository;

@Component
public class BikeShowroomServiceImpl implements BikeShowroomService {
	
	@Autowired
	private BikeShowroomRepository repo;
	
	@Override
	public boolean validateAndSave(BikeShowroomDTO dto) {
		System.out.println("service method");
		return repo.save(dto);
	}

}
