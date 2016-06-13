package ec.edu.epn.controlador;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.epn.modelo.Entrenador;
import ec.edu.epn.modelo.Entrenamiento;
import ec.edu.epn.modelo.Noticia;
import ec.edu.epn.modelo.servicios.GestorAtletismo;
import ec.edu.epn.modelo.servicios.GestorAtletismoEntrenamientos;
import ec.edu.epn.modelo.servicios.GestorNoticias;

@WebServlet("Vistas/Deportes/BuscarEntrenamientoRugby")
public class BuscarEntrenamientoRugby extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Entrenamiento> entrenamientos=null;

    public BuscarEntrenamientoRugby() {
        super();
        
    }

   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//   		String prod = request.getParameter("nombreBusqueda");
   		
   		//Integer id= (Integer)request.getAttribute("idDeporte");;
   		Integer id=5;
   		
		//		System.out.print("nombreBusqueda");
				GestorAtletismoEntrenamientos gn = new GestorAtletismoEntrenamientos();

				entrenamientos = gn.findForIdDeporte(id);
				request.setAttribute("ENTRENAMIENTOS", entrenamientos);
				System.out.print(entrenamientos.size());
				getServletConfig().getServletContext().getRequestDispatcher("/Vistas/Deportes/RugbyEntrenamientos.jsp").forward(request, response);

	}

}
