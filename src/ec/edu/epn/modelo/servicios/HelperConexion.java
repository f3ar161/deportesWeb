package ec.edu.epn.modelo.servicios;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class HelperConexion {
	  public static EntityManager getEMF() {
	        EntityManager emf =(EntityManager)  Persistence.createEntityManagerFactory("JPADeportes").createEntityManager();
	        return emf;
	    }
}
