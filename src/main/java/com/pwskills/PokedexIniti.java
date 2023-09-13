package com.pwskills;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PokedexIniti {

	public static void main(String[] args)
	{
		Pokeman p1= new Pokeman();
		p1.setName("Pikachu");
		p1.setPower(100);
		p1.setType("electrical");
		
		Pokeman p2 = new Pokeman();
		p2.setName("Raichu");
		p2.setPower(200);
		p2.setType("Fire");
		
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("persistenceUnit");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		
		transaction.begin();
		entityManager.persist(p1);
		entityManager.persist(p2);
		transaction.commit();
	}

}
