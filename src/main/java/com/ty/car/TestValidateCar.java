package com.ty.car;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestValidateCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("raghav");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String sql = "Select car from  Car car where car.brand=?1 and car.type=?2";

		Query query = entityManager.createQuery(sql);
		query.setParameter(1, "i20");
		query.setParameter(2, "hatch");

		List<Car> list = query.getResultList();
		if (list.size() > 0) {
			for (Car car : list) {
				System.out.println("Name is:" + car.getName());
				System.out.println("brand is :" + car.getBrand());
				System.out.println("cost is :" + car.getCost());
				System.out.println("type is :" + car.getType());
			}
		} else {
			System.out.println("car not found");
		}
	}

}
