package com.xworkz.abstraction.repository;

import com.xworkz.abstraction.annot.Prajwal;
import com.xworkz.abstraction.entity.ATMEntity;

@Prajwal
public class ATMRepositoryImpl implements ATMRepository {

	@Override
	public boolean save(ATMEntity entity) {
		System.out.println("entity save haagtha ide");
		return false;
	}

}
