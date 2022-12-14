package com.xworkz.busstand.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.busstand.dto.BusStandDTO;

@Component
public class BusStandRepositoryImpl implements BusStandRepository {
	@Autowired
	private EntityManagerFactory factory;

	@Override
	public boolean save(BusStandDTO dto) {
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
