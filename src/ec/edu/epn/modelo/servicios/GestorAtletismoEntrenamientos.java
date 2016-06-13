package ec.edu.epn.modelo.servicios;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.edu.epn.modelo.Entrenador;
import ec.edu.epn.modelo.Entrenamiento;
import ec.edu.epn.modelo.Noticia;

public class GestorAtletismoEntrenamientos {
	private EntityManager em;

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	public List<Entrenamiento> findForIdDeporte(Integer deporte) {
		
		List<Entrenamiento> listaEntrenamientos = new ArrayList<Entrenamiento>();
		try {

			em = HelperConexion.getEMF();
			em.getTransaction().begin();
			Query query = em.createQuery("SELECT n FROM Entrenamiento n WHERE n.deporte.idDeporte like :deporte");
			query.setParameter("deporte", (Integer) deporte );
//			query.setParameter("deporte", "%" + deporte + "%");
			
			listaEntrenamientos = (List<Entrenamiento>) query.getResultList();
			em.getTransaction().commit();
			
		} catch (Exception e) {
			System.out.println("error al consultar entrenamiento por id deporte " + e);
		} finally {

		}

		return listaEntrenamientos;
	}
}
