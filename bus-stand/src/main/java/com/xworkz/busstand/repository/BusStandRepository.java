package com.xworkz.busstand.repository;

import java.util.List;
import java.util.Optional;

import com.xworkz.busstand.dto.BusStandDTO;

public interface BusStandRepository {
	boolean save(BusStandDTO dto);

	Optional<List<BusStandDTO>> findByName(String name);

}
