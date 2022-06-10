package com.ty.car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestInsertUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("raghav ");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		User user = new User();
		user.setName("Claire");
		user.setEmail("claire@gmail.com");
		user.setPassword("Claire@123");
		user.setGender("female");

		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();

	}

}
