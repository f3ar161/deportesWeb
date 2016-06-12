package ec.edu.epn.modelo.servicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import ec.edu.epn.getmovie.model.Actor;
import ec.edu.epn.modelo.Noticia;



public class GestorNoticias {
	
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("deportesWeb");

	@SuppressWarnings("unchecked")
	public List<Noticia> buscarNoticias (int nombreBusqueda){
		List <Noticia> noticias= new ArrayList<Noticia>();
		
		EntityManager em = emf.createEntityManager();
		
		Query q = em.createQuery("select l from noticias as l where l.ID_REPORTE like ? ",Noticia.class);
		q.setParameter(2, nombreBusqueda+"%");
		noticias = q.getResultList();
		return noticias;
	}

	public Noticia buscarNoticia(int idDeporte) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Noticia notica = em.find(Noticia.class, idDeporte);
		em.getTransaction().commit();
		em.close();
		return notica;
	}
	
}
