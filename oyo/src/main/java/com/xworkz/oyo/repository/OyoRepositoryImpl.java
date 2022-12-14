package com.xworkz.oyo.repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

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

	@Override
	public Optional<List<OyoDTO>> findByLocation(String location) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByLocation");
			query.setParameter("lc", location);
			return Optional.ofNullable(query.getResultList());
		} catch (PersistenceException e) {
			e.printStackTrace();
		}finally {
			manager.close();
		}
		return Optional.empty();
	}

}
