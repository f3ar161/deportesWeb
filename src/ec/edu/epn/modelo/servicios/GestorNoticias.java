package ec.edu.epn.modelo.servicios;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import ec.edu.epn.modelo.Noticia;



public class GestorNoticias {

	public List<Noticia> buscarNoticias (String nombreBusqueda){
		List <Noticia> noticias= new ArrayList<Noticia>();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("deportesWeb");
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select * from noticias where l.ID_DEPORTE like ? ",Noticia.class);
		q.setParameter(1, nombreBusqueda+"%");
		noticias = q.getResultList();
		return noticias;
	}
	
}
