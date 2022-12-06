package com.xworkz.abstraction.service;

import com.xworkz.abstraction.annot.Prajwal;
import com.xworkz.abstraction.entity.ATMEntity;

@Prajwal
public interface ATMService {
	boolean validateAndSave(ATMEntity entity);

}
