package com.jsp.car;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetAllCars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("kajol");
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		
		String sql="Select c FROM car c";//query to fetch all records
		Query query= entityManager.createQuery(sql);
		//it contacts the database and has one inbuilt method called createQuery(varName) ,returns the values stored in Query query
		List<car> cars=query.getResultList();//it goes into the database and fetches the records and return it.
		
		for(car c: cars) {
			System.out.println("========");
			System.out.println(c.getBrand());
			System.out.println(c.getName());
			System.out.println(c.getId());
		}
	
	}

}
