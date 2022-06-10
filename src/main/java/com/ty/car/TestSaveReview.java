package com.ty.car;

import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Review review=new Review();
		review.setSubject("small review on environment");
		review.setContent("Lorem ipsum");
		//review.setCreateDateTime(LocalDateTime.now());
		//review.setUpdateDateTime(LocalDateTime.now());
		review.setWriterName("ananya");
		
		entityTransaction.begin();
		entityManager.persist(review);
		entityTransaction.commit();
	}
}
