package ec.edu.epn.controlador;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.epn.modelo.Noticia;

import ec.edu.epn.modelo.servicios.GestorNoticias;

@WebServlet("Vistas/Deportes/BuscarNoticiaFutbol")
public class BuscarNoticiaFutbol extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Noticia> noticias=null;

    public BuscarNoticiaFutbol() {
        super();
        
    }

   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

   		String prod = request.getParameter("nombreBusqueda");
   		
   		//Integer id= (Integer)request.getAttribute("idDeporte");;
   		Integer id=3;
   		
		//		System.out.print("nombreBusqueda");
				GestorNoticias gn = new GestorNoticias();

				noticias = gn.findForIdDeporte(id);
				request.setAttribute("NOTICIAS", noticias);
				System.out.print(noticias.size());
				getServletConfig().getServletContext().getRequestDispatcher("/Vistas/Deportes/Futbol.jsp").forward(request, response);

	}

}

