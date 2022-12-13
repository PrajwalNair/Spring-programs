package com.xworkz.busstand.repository;

import org.springframework.stereotype.Component;

import com.xworkz.busstand.dto.BusStandDTO;

@Component
public class BusStandRepositoryImpl implements BusStandRepository {

	@Override
	public boolean save(BusStandDTO dto) {
		System.out.println("repository method");
		return true;
	}

}
