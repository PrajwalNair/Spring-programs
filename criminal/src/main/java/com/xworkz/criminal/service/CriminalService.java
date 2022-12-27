package com.xworkz.criminal.service;

import java.util.List;
import java.util.Optional;

import com.xworkz.criminal.dto.CriminalDTO;

public interface CriminalService {
	boolean validateAndSave(CriminalDTO dto);
	
	Optional<List<CriminalDTO>>findByNameAndJailName(String name,String jailName);
	
//	Optional<List<CriminalDTO>> findByName(String name);
//
//	Optional<List<CriminalDTO>> findByJailName(String jailName);

}
