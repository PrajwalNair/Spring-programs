package com.xworkz.abstraction.repository;

import com.xworkz.abstraction.annot.Prajwal;
import com.xworkz.abstraction.entity.PendriveEntity;
@Prajwal
public interface PendriveRepository {
	boolean save(PendriveEntity entity);

}
