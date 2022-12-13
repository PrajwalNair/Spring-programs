package com.xworkz.oyo.repository;

import org.springframework.stereotype.Component;

import com.xworkz.oyo.dto.OyoDTO;

@Component
public class OyoRepositoryImpl implements OyoRepository {

	@Override
	public boolean save(OyoDTO dto) {
		System.out.println("repository method");
		return true;
	}

}
