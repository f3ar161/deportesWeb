package ec.edu.epn.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the deportes database table.
 * 
 */
@Entity
@Table(name = "deportes")
@NamedQuery(name = "Deporte.findAll", query = "SELECT d FROM Deporte d")

public class Deporte implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_DEPORTE")
	private int idDeporte;

	@Column(name = "DESCRIPCION_DEPORTES")
	private String descripcionDeportes;

	@Column(name = "NOMBRE_DEPORTE")
	private String nombreDeporte;

	// bi-directional many-to-one association to Entrenador
	@OneToMany(mappedBy = "deporte")
	private List<Entrenador> entrenadors;

	// bi-directional many-to-one association to Entrenamiento
	@OneToMany(mappedBy = "deporte")
	private List<Entrenamiento> entrenamientos;

	// bi-directional many-to-one association to Evento
	@OneToMany(mappedBy = "deporte")
	private List<Evento> eventos;

	// bi-directional many-to-one association to Noticia
	@OneToMany(mappedBy = "deporte")
	private List<Noticia> noticias;

	public Deporte() {
	}

	public int getIdDeporte() {
		return this.idDeporte;
	}

	public void setIdDeporte(int idDeporte) {
		this.idDeporte = idDeporte;
	}

	public String getDescripcionDeportes() {
		return this.descripcionDeportes;
	}

	public void setDescripcionDeportes(String descripcionDeportes) {
		this.descripcionDeportes = descripcionDeportes;
	}

	public String getNombreDeporte() {
		return this.nombreDeporte;
	}

	public void setNombreDeporte(String nombreDeporte) {
		this.nombreDeporte = nombreDeporte;
	}

	public List<Entrenador> getEntrenadors() {
		return this.entrenadors;
	}

	public void setEntrenadors(List<Entrenador> entrenadors) {
		this.entrenadors = entrenadors;
	}

	public Entrenador addEntrenador(Entrenador entrenador) {
		getEntrenadors().add(entrenador);
		entrenador.setDeporte(this);

		return entrenador;
	}

	public Entrenador removeEntrenador(Entrenador entrenador) {
		getEntrenadors().remove(entrenador);
		entrenador.setDeporte(null);

		return entrenador;
	}

	public List<Entrenamiento> getEntrenamientos() {
		return this.entrenamientos;
	}

	public void setEntrenamientos(List<Entrenamiento> entrenamientos) {
		this.entrenamientos = entrenamientos;
	}

	public Entrenamiento addEntrenamiento(Entrenamiento entrenamiento) {
		getEntrenamientos().add(entrenamiento);
		entrenamiento.setDeporte(this);

		return entrenamiento;
	}

	public Entrenamiento removeEntrenamiento(Entrenamiento entrenamiento) {
		getEntrenamientos().remove(entrenamiento);
		entrenamiento.setDeporte(null);

		return entrenamiento;
	}

	public List<Evento> getEventos() {
		return this.eventos;
	}

	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}

	public Evento addEvento(Evento evento) {
		getEventos().add(evento);
		evento.setDeporte(this);

		return evento;
	}

	public Evento removeEvento(Evento evento) {
		getEventos().remove(evento);
		evento.setDeporte(null);

		return evento;
	}

	public List<Noticia> getNoticias() {
		return this.noticias;
	}

	public void setNoticias(List<Noticia> noticias) {
		this.noticias = noticias;
	}

}