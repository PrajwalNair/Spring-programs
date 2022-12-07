package com.xworkz.obstruction.repository;

import org.springframework.stereotype.Component;

import com.xworkz.obstruction.entity.TikTokEntity;

@Component
public class TikTokRepositoryImpl implements TikTokRepository {

	@Override
	public boolean save(TikTokEntity entity) {
		System.out.println(getClass().getSimpleName());
		return false;
	}

}
