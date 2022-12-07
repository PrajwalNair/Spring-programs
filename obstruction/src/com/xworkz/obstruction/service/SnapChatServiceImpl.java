package com.xworkz.obstruction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.obstruction.entity.SnapChatEntity;
import com.xworkz.obstruction.repository.SnapChatRepository;

@Component
public class SnapChatServiceImpl implements SnapChatService {
	@Autowired
	@Qualifier("snapChatRepository")
	private SnapChatRepository repo;

	@Override
	public boolean validateAndSave(SnapChatEntity entity) {
		System.out.println(getClass().getSimpleName());
		repo.save(entity);
		return true;
	}

}
