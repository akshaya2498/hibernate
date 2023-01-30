package com.jsp.car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class carDriver {

	public static void main(String[] args) {
		

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("kajol");
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		
		car c1=new car();
		c1.setId(10);
		c1.setName("xs");
		c1.setBrand("bmw");
		
		entityTransaction.begin();
		entityManager.persist(c1);
		entityTransaction.commit();
		System.out.println("all is good");
		
	}

}
