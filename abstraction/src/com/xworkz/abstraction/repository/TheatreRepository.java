package com.xworkz.abstraction.repository;

import com.xworkz.abstraction.annot.Prajwal;
import com.xworkz.abstraction.entity.TheatreEntity;

@Prajwal
public interface TheatreRepository {
	boolean save(TheatreEntity entity);

}
