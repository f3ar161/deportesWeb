package ec.edu.epn.controlador;


import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.epn.modelo.Entrenador;
import ec.edu.epn.modelo.Noticia;
import ec.edu.epn.modelo.servicios.GestorAtletismo;
import ec.edu.epn.modelo.servicios.GestorNoticias;

@WebServlet("Vistas/Deportes/BuscarEntrenadorRugby")
public class BuscarEntrenadorRugby extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Entrenador> entrenadores=null;

    public BuscarEntrenadorRugby() {
        super();
        
    }

   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//   		String prod = request.getParameter("nombreBusqueda");
   		
   		//Integer id= (Integer)request.getAttribute("idDeporte");;
   		Integer id=5;
   		
		//		System.out.print("nombreBusqueda");
				GestorAtletismo gn = new GestorAtletismo();

				entrenadores = gn.findForIdDeporte(id);
				request.setAttribute("ENTRENADORES", entrenadores);
				System.out.print(entrenadores.size());
				getServletConfig().getServletContext().getRequestDispatcher("/Vistas/Deportes/RugbyEntrenadores.jsp").forward(request, response);

	}

}

