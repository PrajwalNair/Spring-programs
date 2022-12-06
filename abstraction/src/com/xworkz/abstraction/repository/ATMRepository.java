package com.xworkz.abstraction.repository;

import org.springframework.stereotype.Component;

import com.xworkz.abstraction.annot.Prajwal;
import com.xworkz.abstraction.entity.ATMEntity;

@Prajwal
public interface ATMRepository {
	boolean save(ATMEntity entity);

}
