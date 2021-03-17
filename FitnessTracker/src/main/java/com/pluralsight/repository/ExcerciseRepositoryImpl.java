package com.pluralsight.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.pluralsight.model.Exercise;

@Repository("excerciseRepository")
public class ExcerciseRepositoryImpl implements ExcerciseRepository {

	@PersistenceContext
	private EntityManager em;
	
	public Exercise save(Exercise excercise) {
		
		em.persist(excercise);
		
		em.flush();
		
		return excercise;
	}

}
