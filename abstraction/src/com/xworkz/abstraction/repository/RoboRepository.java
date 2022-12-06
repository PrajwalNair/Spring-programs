package com.xworkz.abstraction.repository;

import com.xworkz.abstraction.annot.Prajwal;
import com.xworkz.abstraction.entity.RoboEntity;

@Prajwal
public interface RoboRepository {
	boolean save (RoboEntity entity);

}
