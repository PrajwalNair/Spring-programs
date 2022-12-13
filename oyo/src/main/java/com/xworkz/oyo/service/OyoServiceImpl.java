package com.xworkz.oyo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.oyo.dto.OyoDTO;
import com.xworkz.oyo.repository.OyoRepository;

@Component
public class OyoServiceImpl implements OyoService {
	@Autowired
	private OyoRepository repo;

	@Override
	public boolean validateAndSave(OyoDTO dto) {
		System.out.println("service method");
		return repo.save(dto);
	}

}
