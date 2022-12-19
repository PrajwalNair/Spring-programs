package com.xworkz.bikeshowroom.repository;

import java.util.List;
import java.util.Optional;

import com.xworkz.bikeshowroom.dto.BikeShowroomDTO;

public interface BikeShowroomRepository {
	boolean save(BikeShowroomDTO dto);

	Optional<List<BikeShowroomDTO>> findByBrand(String brand);

}
