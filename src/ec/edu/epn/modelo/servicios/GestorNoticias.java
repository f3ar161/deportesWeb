package ec.edu.epn.modelo.servicios;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.edu.epn.modelo.Deporte;
import ec.edu.epn.modelo.Noticia;

public class GestorNoticias {

	private EntityManager em;

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	public List<Noticia> buscarNoticias(int nombreBusqueda) {
		List<Noticia> noticias = new ArrayList<Noticia>();

		em = HelperConexion.getEMF();

		Query q = em.createQuery("select n.TITULO_NOTICA from noticias n where n.ID_DEPORTE like ? ", Noticia.class);
		q.setParameter(2, nombreBusqueda + "%");
		noticias = q.getResultList();
		return noticias;
	}

	public Noticia buscarNoticia(int idDeporte) {
		em = HelperConexion.getEMF();
		em.getTransaction().begin();
		Noticia notica = em.find(Noticia.class, idDeporte);
		em.getTransaction().commit();
		em.close();
		return notica;
	}

	
	public List<Noticia> findForIdDeporte(Integer deporte) {
	
		List<Noticia> listaNoticia = new ArrayList<Noticia>();
		try {

			em = HelperConexion.getEMF();
			em.getTransaction().begin();
			Query query = em.createQuery("SELECT n FROM Noticia n WHERE n.deporte.idDeporte like :deporte");
			query.setParameter("deporte", (Integer) deporte );
//			query.setParameter("deporte", "%" + deporte + "%");
			
			listaNoticia = (List<Noticia>) query.getResultList();
			em.getTransaction().commit();
			
		} catch (Exception e) {
			System.out.println("error al consultar noticiasl por id deporte " + e);
		} finally {

		}

		return listaNoticia;
	}
	public List<Noticia> findForTituloNoticia(String tituloNoticia) {
		List<Noticia> listaNoticia = new ArrayList<Noticia>();
		try {

			em = HelperConexion.getEMF();
			em.getTransaction().begin();
			Query query = em.createQuery("SELECT n FROM Noticia n WHERE n.tituloNoticia like :tituloNoticia");
			query.setParameter("tituloNoticia", "%" + tituloNoticia + "%");
			listaNoticia = (List<Noticia>) query.getResultList();
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println("error al consultar noticiasl por titulo " + e);
		} finally {

		}

		return listaNoticia;
	}

	@SuppressWarnings("unchecked")
	public List<Noticia> listarNoticia(int IDDEPORTE) {
		em = HelperConexion.getEMF();
		Query q = em.createQuery("select n from noticias n where n.ID_NOTICIAS like ? ", Noticia.class);
		q.setParameter(1, IDDEPORTE + "%");
		List<Noticia> listaNoticia = q.getResultList();
		em.close();
		return listaNoticia;
	}

}
