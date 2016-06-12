package ec.edu.epn.controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.epn.getmovie.model.Actor;
import ec.edu.epn.getmovie.model.service.actor.ServiceActor;
import ec.edu.epn.modelo.Noticia;

import ec.edu.epn.modelo.servicios.GestorNoticias;

/**
 * Servlet implementation class BuscarNoticia
 */
@WebServlet("/Deportes/BuscarNoticia")
public class BuscarNoticia extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Noticia> noticias=null;

    public BuscarNoticia() {
        super();
        
    }

    //recibe las peticiones
   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//preparar la informacion
				
   			/*	request.setAttribute("nombreBusqueda", new Integer(1));
				int id = Integer.parseInt(request.getParameter("nombreBusqueda"));
				//llamar al modelo
				System.out.print("nombreBusqueda");
				GestorNoticias gn = new GestorNoticias();
				
				noticias = gn.buscarNoticia(id);
				//publicar la informacion
				request.setAttribute("NOTICIAS", noticias);
				//redireccionar a la vista
				getServletConfig().getServletContext().getRequestDispatcher("/Vistas/Deportes/Atletismo.jsp").forward(request, response);
*/
   		
   		GestorNoticias sa = new GestorNoticias();
   		request.setAttribute("nombreBusqueda", new Integer(1));
   				String idDeporte = request.getParameter("nombreBusqueda");
   		
		if (idDeporte == null)
			idDeporte = "nada verga hijo de pugtaaaaaaaaaaa";
		Noticia n = sa.buscarNoticia((int)Integer.parseInt(idDeporte));
		request.setAttribute("NOTICIAS", n);
		getServletConfig().getServletContext().getRequestDispatcher("/Vistas/Deportes/Atletismo.jsp").forward(request, response);

	}

}
