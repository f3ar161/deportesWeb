package ec.edu.epn.controlador;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.epn.modelo.Noticia;

import ec.edu.epn.modelo.servicios.GestorNoticias;

/**
 * Servlet implementation class BuscarNoticia
 */
@WebServlet("Vistas/Deportes/BuscarNoticia")
public class BuscarNoticia extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Noticia> noticias=null;

    public BuscarNoticia() {
        super();
        
    }

    //recibe las peticiones
   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//preparar la informacion
   		String prod = request.getParameter("nombreBusqueda");
//   		System.out.println("valor del servlet "+prod);
//   				request.setAttribute("nombreBusqueda", new Integer(1));
//				int id = Integer.parseInt(request.getParameter("nombreBusqueda"));
				//llamar al modelo
				System.out.print("nombreBusqueda");
				GestorNoticias gn = new GestorNoticias();
				
				noticias = gn.findForTituloNoticia(prod);
				//publicar la informacion1111111111111111111111111
				request.setAttribute("NOTICIAS", noticias);
				//redireccionar a la vista
				getServletConfig().getServletContext().getRequestDispatcher("/Vistas/Deportes/Atletismo.jsp").forward(request, response);

   
		/*	GestorNoticias sa = new GestorNoticias();
    	request.setAttribute("nombreBusqueda", new Integer(1));
		int idNoticia = Integer.valueOf(request.getParameter("nombreBusqueda"));
				
		Collection<Noticia> listaNoticia = sa.listarNoticia(idNoticia);
		
		request.setAttribute("listaNoticia", listaNoticia);
		getServletConfig().getServletContext().getRequestDispatcher("/Vistas/Deportes/Atletismo.jsp").forward(request, response);
		
	//	getServletConfig().getServletContext().getRequestDispatcher("/Vistas/actor/administrar.jsp").forward(request, response);
		
		response.getWriter().print("nombreBusqueda");
*/
	}

}
