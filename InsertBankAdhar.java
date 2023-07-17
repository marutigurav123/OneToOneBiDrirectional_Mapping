package com.hibernatesBank;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertBankAdhar {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("manisha");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction(); 	
		Bank b=new Bank();
		b.setId(1);
		b.setBname("SBI");
		b.setBadress("Lohara");
		
		Adhar adhar=new Adhar();
		adhar.setId(11);
		adhar.setAno(4654464l);
		adhar.setB(b);
		entityTransaction.begin();
		entityManager.persist(b);
		entityManager.persist(adhar);
		entityTransaction.commit();			
	}
}
