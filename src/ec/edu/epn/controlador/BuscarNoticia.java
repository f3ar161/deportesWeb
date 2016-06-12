package ec.edu.epn.controlador;

import java.io.IOException;
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
@WebServlet("/BuscarNoticia")
public class BuscarNoticia extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuscarNoticia() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//preparar la informacion
				
				String deporteID = request.getParameter("deporteID");
				int id= Integer.parseInt(deporteID);
				//llamar al modelo
				System.out.print("deporteID");
				GestorNoticias gl = new GestorNoticias();
				List<Noticia> noticias=null;
				noticias = gl.buscarNoticias(id);
				//publicar la informacion
				request.setAttribute("NOTICIAS", noticias);
				//redireccionar a la vista
				
				RequestDispatcher rd = request.getServletContext().getRequestDispatcher("/Vistas/Deportes/Atletismo.jsp");
				rd.forward(request, response);
				System.out.print("3");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
