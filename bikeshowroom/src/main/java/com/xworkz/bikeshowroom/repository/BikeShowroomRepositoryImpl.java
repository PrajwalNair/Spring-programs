package com.xworkz.bikeshowroom.repository;

import org.springframework.stereotype.Component;

import com.xworkz.bikeshowroom.dto.BikeShowroomDTO;

@Component
public class BikeShowroomRepositoryImpl implements BikeShowroomRepository {
	

	@Override
	public boolean save(BikeShowroomDTO dto) {
		System.out.println("repository method");
		return true;
	}

}
