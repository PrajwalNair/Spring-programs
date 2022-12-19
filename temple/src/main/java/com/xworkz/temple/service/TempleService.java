package com.xworkz.temple.service;

import java.util.List;
import java.util.Optional;

import com.xworkz.temple.dto.TempleDTO;

public interface TempleService {
	boolean validateAndSave(TempleDTO dto);
	
	Optional<List<TempleDTO>> findByGod(String god);

}
