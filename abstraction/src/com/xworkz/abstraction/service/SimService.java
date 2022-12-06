package com.xworkz.abstraction.service;

import com.xworkz.abstraction.annot.Prajwal;
import com.xworkz.abstraction.entity.SimEntity;

@Prajwal
public interface SimService {
	boolean validateAndSave(SimEntity entity);

}
