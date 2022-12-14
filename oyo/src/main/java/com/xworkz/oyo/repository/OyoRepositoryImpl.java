package com.xworkz.oyo.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.oyo.dto.OyoDTO;

@Component
public class OyoRepositoryImpl implements OyoRepository {
	@Autowired
	private EntityManagerFactory factory;

	@Override
	public boolean save(OyoDTO dto) {
		System.out.println("repository method");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(dto);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			manager.close();
		}
		return true;
	}

}
