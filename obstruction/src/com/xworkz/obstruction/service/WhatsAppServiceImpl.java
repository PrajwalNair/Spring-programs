package com.xworkz.obstruction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.obstruction.entity.WhatsAppEntity;
import com.xworkz.obstruction.repository.WhatsAppRepository;

@Component
public class WhatsAppServiceImpl implements WhatsAppService {
	@Autowired
	@Qualifier("whatsAppRepository")
	private WhatsAppRepository repo;

	@Override
	public boolean validateAndSave(WhatsAppEntity entity) {
		System.out.println(getClass().getSimpleName());
		repo.save(entity);
		return false;
	}

}
