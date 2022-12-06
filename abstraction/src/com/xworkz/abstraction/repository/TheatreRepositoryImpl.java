package com.xworkz.abstraction.repository;

import com.xworkz.abstraction.annot.Prajwal;
import com.xworkz.abstraction.entity.TheatreEntity;

@Prajwal
public class TheatreRepositoryImpl implements TheatreRepository {

	@Override
	public boolean save(TheatreEntity entity) {
		System.out.println("theatre repository alli save aagtha ide");
		return true;
	}

}
