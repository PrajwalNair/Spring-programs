package com.xworkz.busstand.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.busstand.dto.BusStandDTO;
import com.xworkz.busstand.repository.BusStandRepository;

@Component
public class BusStandServiceImpl implements BusStandService {
	@Autowired
	private BusStandRepository repo;

	@Override
	public boolean validateAndSave(BusStandDTO dto) {
		System.out.println("service method");
		return repo.save(dto);
	}

}
