package com.xworkz.abstraction.repository;

import com.xworkz.abstraction.annot.Prajwal;
import com.xworkz.abstraction.entity.SimEntity;

@Prajwal
public interface SimRepository {
	boolean save(SimEntity entity);

}
