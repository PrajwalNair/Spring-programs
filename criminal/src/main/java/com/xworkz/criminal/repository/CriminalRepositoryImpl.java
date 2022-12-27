package com.xworkz.criminal.repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.criminal.dto.CriminalDTO;

@Repository
public class CriminalRepositoryImpl implements CriminalRepository {
	@Autowired
	private EntityManagerFactory factory;

	@Override
	public boolean save(CriminalDTO dto) {
		System.out.println("Save method is running");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(dto);
			transaction.commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			manager.close();
		}
		return true;
	}

//	@Override
//	public Optional<List<CriminalDTO>> findByName(String name) {
//		System.out.println("Find by name method is running");
//		EntityManager manager = factory.createEntityManager();
//		Query query = manager.createNamedQuery("findByName");
//		query.setParameter("nm", name);
//		List resultList = query.getResultList();
//		if (resultList != null) {
//			System.out.println("data is present" + resultList);
//			return Optional.ofNullable(resultList);
//		} else {
//			System.out.println("data is not present");
//			return Optional.empty();
//		}
//
//	}
//
//	@Override
//	public Optional<List<CriminalDTO>> findByJailName(String jailName) {
//		System.out.println("Find by jail name method is running");
//		EntityManager manager = factory.createEntityManager();
//		Query query = manager.createNamedQuery("findByJailName");
//		query.setParameter("jn", jailName);
//		List resultList = query.getResultList();
//		if (resultList != null) {
//			System.out.println("data is present" + resultList);
//			return Optional.ofNullable(resultList);
//		} else {
//			System.out.println("data is not present");
//			return Optional.empty();
//		}
//
//	}

	@Override
	public Optional<List<CriminalDTO>> findByNameAndJailName(String name, String jailName) {
		System.out.println("find by name and find by jail name method is running");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByNameAndJailName");
		query.setParameter("nm", name);
		query.setParameter("jn", jailName);
		List resultList = query.getResultList();
		if(resultList!=null) {
			System.out.println("data is present");
			return Optional.ofNullable(resultList);
		}else {
			System.out.println("data is not present");
			return Optional.empty();
		}
		
	}

}
