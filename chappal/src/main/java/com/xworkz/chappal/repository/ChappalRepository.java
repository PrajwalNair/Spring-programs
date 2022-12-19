package com.xworkz.chappal.repository;

import java.util.List;
import java.util.Optional;

import com.xworkz.chappal.entity.ChappalEntity;

public interface ChappalRepository {
	boolean save(ChappalEntity entity);
	
	Optional<List<ChappalEntity>>findByBrand(String brand);

}
