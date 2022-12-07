package com.xworkz.obstruction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.obstruction.entity.TikTokEntity;
import com.xworkz.obstruction.repository.TikTokRepository;

@Component
public class TikTokServiceImpl implements TikTokService {
	@Autowired
	@Qualifier("tikTokRepository")
	private TikTokRepository repo;

	@Override
	public boolean validateAndSave(TikTokEntity entity) {
		System.out.println(getClass().getSimpleName());
		repo.save(entity);
		return true;
	}

}
