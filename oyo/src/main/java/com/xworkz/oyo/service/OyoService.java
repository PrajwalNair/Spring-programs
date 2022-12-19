package com.xworkz.oyo.service;

import java.util.List;
import java.util.Optional;

import com.xworkz.oyo.dto.OyoDTO;

public interface OyoService {
	boolean validateAndSave(OyoDTO dto);
	
	Optional<List<OyoDTO>> findByLocation(String location);

}
