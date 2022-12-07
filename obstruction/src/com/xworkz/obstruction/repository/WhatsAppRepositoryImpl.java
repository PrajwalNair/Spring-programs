package com.xworkz.obstruction.repository;

import org.springframework.stereotype.Component;

import com.xworkz.obstruction.entity.WhatsAppEntity;
@Component
public class WhatsAppRepositoryImpl implements WhatsAppRepository {

	@Override
	public boolean save(WhatsAppEntity entity) {
		System.out.println(getClass().getSimpleName());
		return true;
	}

}
