package ec.edu.epn.controlador;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import deportes.Noticia;
import ec.edu.epn.modelo.servicio.GestorNoticias;

@WebServlet("/Vistas/Noticias/CrearNoticiaCtrl")
public class CrearNoticiaCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 public CrearNoticiaCtrl() {
		// TODO Auto-generated constructor stub
	
	        super();
	    }
	    // recibir la peticion
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// preparar la información
			String TITULO_NOTICIA = request.getParameter("txtTitulo");
			String INFORMACIO_NOTICIA = request.getParameter("txtInformacion");
			String AUTOR_NOTICIA = request.getParameter("txtAutor");
			String FECHA_NOTICIA = request.getParameter("txtFecha");
			String HORA_NOTICIA = request.getParameter("txtHora");
			
			Noticia noticia = new Noticia();
			
			SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd/MM/yyyy");
			SimpleDateFormat horaFormato = new SimpleDateFormat("HH:mm:ss");
			Date fecha = null;
			Date hora = null;
			try {

			fecha = formatoDelTexto.parse(FECHA_NOTICIA);
			hora = horaFormato.parse(HORA_NOTICIA);
			} catch (ParseException ex) {

			ex.printStackTrace();

			}
			noticia.setTituloNoticia(TITULO_NOTICIA);
			noticia.setInformacion(INFORMACIO_NOTICIA);
			noticia.setAutorNoticia(AUTOR_NOTICIA);
			noticia.setFechaNoticia(fecha);
			noticia.setHoraNoticia(hora);
			
			// llamar al modelo
			GestorNoticias gn = new GestorNoticias();
			String resultado="";
			try {
			  gn.crearNoticia(noticia);
			  resultado="Creacion Exitosa";
			}catch(Exception e){
			  resultado="Error en la creación " + e.getMessage();
			  e.printStackTrace();
			}
			
			
			// publicar los datos devueltos por el modelo
			/*ServletContext application = request.getServletContext();
			   application.setAttribute("Nombre Variable",Objeto);
			  HttpSession session= request.getSession();
			   session.setAttribute("", Objeto);
			   request.setAttribute("", Objeto);*/
			   request.setAttribute("RESULTADO", resultado);  
			 
			// redireccionar a la vista
			RequestDispatcher rd = 
			  request.getServletContext().getRequestDispatcher("/Vistas/Noticias/Noticias.jsp");
			
			rd.forward(request,response);
			
		}

	}

