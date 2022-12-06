package com.xworkz.abstraction.repository;

import com.xworkz.abstraction.annot.Prajwal;
import com.xworkz.abstraction.entity.PendriveEntity;
@Prajwal
public class PendriveRepositoryImpl implements PendriveRepository {

	@Override
	public boolean save(PendriveEntity entity) {
		System.out.println("pendrive repository alli save aagtha ide");
		return true;
	}

}
