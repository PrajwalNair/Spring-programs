package com.xworkz.chappal.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.chappal.entity.ChappalEntity;

@Component
public class ChappalRepositoryImpl implements ChappalRepository {
	@Autowired
	private EntityManagerFactory factory;

	@Override
	public boolean save(ChappalEntity entity) {
		System.out.println("repository method");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(entity);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}finally {
			manager.close();
		}
		return true;
	}

}
