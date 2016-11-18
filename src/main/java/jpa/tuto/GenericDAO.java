package jpa.tuto;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class GenericDAO {
	
	private EntityManagerFactory factory = null;

	public void createEntityManager(){
		factory = Persistence.createEntityManagerFactory("myBase");
		
	}
	
	public void closeEntityManager(){
		 if (factory != null) {
	         factory.close();
		
		 }
	}
	
	
}
