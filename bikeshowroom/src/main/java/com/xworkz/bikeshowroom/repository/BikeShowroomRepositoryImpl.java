package com.xworkz.bikeshowroom.repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.bikeshowroom.dto.BikeShowroomDTO;

@Component
public class BikeShowroomRepositoryImpl implements BikeShowroomRepository {
	@Autowired
	@PersistenceUnit(name = "com.xworkz")
	private EntityManagerFactory factory;

	@Override
	public boolean save(BikeShowroomDTO dto) {
		System.out.println(" Calling repository method from BikeShowroomRepositoryImpl" + factory);
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

	@Override
	public Optional<List<BikeShowroomDTO>> findByBrand(String brand) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByBrand");
			query.setParameter("bd", brand);
			return Optional.ofNullable(query.getResultList());
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return Optional.empty();

	}

}
