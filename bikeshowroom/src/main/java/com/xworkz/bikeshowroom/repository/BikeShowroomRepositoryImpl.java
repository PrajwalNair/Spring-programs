package com.xworkz.bikeshowroom.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.bikeshowroom.dto.BikeShowroomDTO;

@Component
public class BikeShowroomRepositoryImpl implements BikeShowroomRepository {
	@Autowired
	@PersistenceUnit(name ="com.xworkz")
	private EntityManagerFactory factory;

	@Override
	public boolean save(BikeShowroomDTO dto) {
		System.out.println(" Calling repository method from BikeShowroomRepositoryImpl"+factory);
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
