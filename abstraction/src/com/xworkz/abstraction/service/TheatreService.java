package com.xworkz.abstraction.service;

import com.xworkz.abstraction.annot.Prajwal;
import com.xworkz.abstraction.entity.TheatreEntity;

@Prajwal
public interface TheatreService {
	boolean validateAndSave(TheatreEntity entity);

}
