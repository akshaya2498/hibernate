package com.jsp.car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class carUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("kajol");
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		car car=entityManager.find(car.class,4);
		car.setName("X5");
		if(car!=null) {
			entityTransaction.begin();
			entityManager.merge(car);
			entityTransaction.commit();
			System.out.println("Value updated");
		}
		else {
			System.out.println("Value not updated");
			
		}
	

	}

}