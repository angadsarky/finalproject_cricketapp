package com.del.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	private static EntityManager em;

	public static EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		if(em==null) {
			EntityManagerFactory emf =
				Persistence.createEntityManagerFactory("cricketApp");
			em = emf.createEntityManager();
		}
		return em;
	}

}
