package ec.edu.epn.modelo.servicio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import deportes.Noticia;

public class GestorNoticias {
	public void crearNoticia(Noticia noticia) {
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("deportesWebJPA");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(noticia);
		em.getTransaction().commit();
		em.close();
	}
	
	public List<Noticia> buscarNoticias (String nombreBusqueda){
		List <Noticia> noticias= new ArrayList<Noticia>();
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("deportesWebJPA");
		EntityManager em = emf.createEntityManager();
		
		Query q = em.createQuery("select l from Noticia as l where l.TITULO_NOTICIA like ? ",Noticia.class);
		q.setParameter(1, nombreBusqueda+"%");
		noticias = q.getResultList();
		return noticias;
	}
}
