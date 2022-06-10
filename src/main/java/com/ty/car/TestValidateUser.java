package com.ty.car;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestValidateUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("raghav");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		/*
		String sql = "select user from User user where user.email=?1 and user.password=?2";

		Query query = entityManager.createQuery(sql);
		query.setParameter(1, "claire@gmail.com");
		query.setParameter(2, "Claire@123");

		List<User> list = query.getResultList();
		if (list.size() > 0) {
			for (User user : list) {
				System.out.println("Id is:" + user.getId());
				System.out.println("Name is :" + user.getName());
				System.out.println("Email is :" + user.getEmail());
				System.out.println("Password is :" + user.getPassword());
			}
		} else {
			System.out.println("no user exist");
		}
*/
		
		String sql="select user from User user where user.email:myEmail and user.password:myPassword";
		
		Query query=entityManager.createQuery(sql);
		query.setParameter("myEmail", "clair@gmail.com");
		query.setParameter("myPassword", "Clair@123");
		
		List<User> list=query.getResultList();
		for(User user:list) {
		System.out.println("id is :"+user.getId());
		System.out.println("Name is :" + user.getName());
		System.out.println("Email is :" + user.getEmail());
		System.out.println("Password is :" + user.getPassword());
		
		}
	}

}
