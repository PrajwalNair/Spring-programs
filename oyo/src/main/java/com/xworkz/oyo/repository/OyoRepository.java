package com.xworkz.oyo.repository;

import java.util.List;
import java.util.Optional;

import com.xworkz.oyo.dto.OyoDTO;

public interface OyoRepository {
	boolean save(OyoDTO dto);

	Optional<List<OyoDTO>> findByLocation(String location);

}
