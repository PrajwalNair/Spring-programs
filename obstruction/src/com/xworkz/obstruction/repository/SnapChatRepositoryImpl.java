package com.xworkz.obstruction.repository;

import org.springframework.stereotype.Component;

import com.xworkz.obstruction.entity.SnapChatEntity;

@Component
public class SnapChatRepositoryImpl implements SnapChatRepository {

	@Override
	public boolean save(SnapChatEntity entity) {
		System.out.println(getClass().getSimpleName());
		return false;
	}

}
