package com.xworkz.abstraction.service;

import com.xworkz.abstraction.annot.Prajwal;
import com.xworkz.abstraction.entity.PendriveEntity;
@Prajwal
public interface PendriveService {
	boolean validateAndSave(PendriveEntity entity);

}
