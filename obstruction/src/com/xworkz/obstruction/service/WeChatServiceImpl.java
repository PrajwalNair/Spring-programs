package com.xworkz.obstruction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.obstruction.entity.WeChatEntity;
import com.xworkz.obstruction.repository.WeChatRepository;

@Component
public class WeChatServiceImpl implements WeChatService {
	@Autowired
	@Qualifier("weChatRepository")
	private WeChatRepository repo;

	@Override
	public boolean validateAndSave(WeChatEntity entity) {
		System.out.println(getClass().getSimpleName());
		repo.save(entity);
		return false;
	}

}
