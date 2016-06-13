package ec.edu.epn.modelo.servicios;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.edu.epn.modelo.Entrenador;
import ec.edu.epn.modelo.Noticia;

public class GestorAtletismo {
	private EntityManager em;

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	public List<Entrenador> findForIdDeporte(Integer deporte) {
		
		List<Entrenador> listaEntrenador = new ArrayList<Entrenador>();
		try {

			em = HelperConexion.getEMF();
			em.getTransaction().begin();
			Query query = em.createQuery("SELECT n FROM Entrenador n WHERE n.deporte.idDeporte like :deporte");
			query.setParameter("deporte", (Integer) deporte );
//			query.setParameter("deporte", "%" + deporte + "%");
			
			listaEntrenador = (List<Entrenador>) query.getResultList();
			em.getTransaction().commit();
			
		} catch (Exception e) {
			System.out.println("error al consultar entrenador por id deporte " + e);
		} finally {

		}

		return listaEntrenador;
	}
}
