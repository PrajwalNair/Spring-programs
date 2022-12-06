package com.xworkz.abstraction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.xworkz.abstraction.annot.Prajwal;
import com.xworkz.abstraction.entity.RoboEntity;
import com.xworkz.abstraction.repository.RoboRepository;

@Prajwal
public class RoboServiceImpl implements RoboService {
	@Autowired
	@Qualifier("RoboRepository")
	private RoboRepository repo;
	@Override
	public boolean validateAndSave(RoboEntity entity) {
		System.out.println("Robo validate aagi save aagtha ide");
		return true;
	}

}
