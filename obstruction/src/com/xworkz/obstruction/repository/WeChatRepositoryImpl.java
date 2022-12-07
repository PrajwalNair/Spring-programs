package com.xworkz.obstruction.repository;

import org.springframework.stereotype.Component;

import com.xworkz.obstruction.entity.WeChatEntity;

@Component
public class WeChatRepositoryImpl implements WeChatRepository {

	@Override
	public boolean save(WeChatEntity entity) {
		System.out.println(getClass().getSimpleName());
		return true;
	}

}
