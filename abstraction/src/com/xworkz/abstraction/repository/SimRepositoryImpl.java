package com.xworkz.abstraction.repository;

import com.xworkz.abstraction.annot.Prajwal;
import com.xworkz.abstraction.entity.SimEntity;

@Prajwal
public class SimRepositoryImpl implements SimRepository {

	@Override
	public boolean save(SimEntity entity) {
		System.out.println("sim is saving into the repository");
		return false;
	}

}
