package com.xworkz.abstraction.service;

import com.xworkz.abstraction.annot.Prajwal;
import com.xworkz.abstraction.entity.RoboEntity;

@Prajwal
public interface RoboService {
	boolean validateAndSave(RoboEntity entity);

}
