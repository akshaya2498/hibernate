package com.jsp.car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("kajol");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
        car car=entityManager.find(car.class,1);
		
		if(car!=null) {
			entityTransaction.begin();
			entityManager.remove(car);
			entityTransaction.commit();
			
			System.out.println("Object with above id deleted");
			
		
		}else {
			System.out.println("No such id found");
			
		}

	}

}
