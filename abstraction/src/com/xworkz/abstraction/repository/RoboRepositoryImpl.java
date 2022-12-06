package com.xworkz.abstraction.repository;

import com.xworkz.abstraction.annot.Prajwal;
import com.xworkz.abstraction.entity.RoboEntity;
@Prajwal
public class RoboRepositoryImpl implements RoboRepository {

	@Override
	public boolean save(RoboEntity entity) {
		System.out.println("robo repository alli save aagtha ide");
		return true;
	}

}
