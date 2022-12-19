package com.xworkz.bikeshowroom.service;

import java.util.List;
import java.util.Optional;

import com.xworkz.bikeshowroom.dto.BikeShowroomDTO;

public interface BikeShowroomService {
	boolean validateAndSave(BikeShowroomDTO dto);
	
	Optional<List<BikeShowroomDTO>> findByBrand(String brand);

}
