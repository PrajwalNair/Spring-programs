package com.xworkz.busstand.service;

import java.util.List;
import java.util.Optional;

import com.xworkz.busstand.dto.BusStandDTO;

public interface BusStandService {
	boolean validateAndSave(BusStandDTO dto);
	
	Optional<List<BusStandDTO>> findByName(String name);

}
