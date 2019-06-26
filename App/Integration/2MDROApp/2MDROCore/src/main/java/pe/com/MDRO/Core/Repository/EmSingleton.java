package pe.com.MDRO.Core.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmSingleton {
	private  static final EntityManagerFactory emf=Persistence.createEntityManagerFactory("prueba");
	private  static EntityManager em=emf.createEntityManager();
	private static EmSingleton singleton=null;
	
	private EmSingleton() {
		
		// TODO Auto-generated constructor stub
	}
	public static EmSingleton get_instance() {
		if(singleton==null) {
			singleton = new EmSingleton();
			
		}
		
		return singleton;
		
	}
	public EntityManager get_em() {
		return em;
	}
	
	
	
	
	
}
