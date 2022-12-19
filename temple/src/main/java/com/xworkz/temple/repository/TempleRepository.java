package com.xworkz.temple.repository;

import java.util.List;
import java.util.Optional;

import com.xworkz.temple.dto.TempleDTO;

public interface TempleRepository {
	boolean save(TempleDTO dto);

	Optional<List<TempleDTO>> findByGod(String god);

}
