package com.xworkz.chappal.service;

import java.util.List;
import java.util.Optional;

import com.xworkz.chappal.entity.ChappalEntity;

public interface ChappalService {
	boolean validateAndSave(ChappalEntity entity);
	
	Optional<List<ChappalEntity>>findByBrand(String brand);

}
