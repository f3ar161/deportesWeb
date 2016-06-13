<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, ec.edu.epn.modelo.*, ec.edu.epn.controlador.BuscarNoticia, java.text.DateFormat,
java.text.ParseException,java.text.SimpleDateFormat;
import java.util.Calendar, java.util.Date, java.util.GregorianCalendar" %>

<jsp:include page="/commons/header1.jsp"></jsp:include>

<section class="container">
<!-- Main Content -->

      
      <form action="BuscarEntrenadorFutbol" method="get">
      <h3>Entrenadores</h3>
      <button type="submit" class="btn btn-primary btn-xs">Conocelos</button>
      </form>
      <hr>
	<article>
		<div class="container">
			<div class="row">
				<div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
					<table style="border-collapse: separate; border-spacing: 15px;">
						<tr>
							<th>Nombre del entrenador</th>
							<th>Tipo de entrenador</th>
							
						</tr>
						<%
							List<Entrenador> entrenadores = (List<Entrenador>) request.getAttribute("ENTRENADORES");
							
							if (entrenadores != null) {
								for (Entrenador l : entrenadores) {		
						%>
						<tr>
							<td><%=l.getNombreEntrenador()%></td>
							<td><%=l.getTipoEntrenador()%></td>
							
						</tr>
						<%
							} 
								}
							
						%>

					</table>
					<hr><hr>
				 
 						 <span class="caption text-muted">La figura del entrenador se compromete con el usuario a hacer todo lo que est&eacute; en su mano para que el entreno resulte divertido y seguro, buscando ejercicios variados y adecuados a cada momento o necesidad.</span>

				</div>
			</div>
		</div>
	</article>

	<hr>
	<ul class="pager">
                    <li class="next">
                        <a href="${pageContext.request.contextPath}/Vistas/Deportes/Futbol.jsp">Regresar &larr;</a>
                    </li>
                </ul>


    <hr>
</section>
<jsp:include page="/commons/footer.jsp"></jsp:include>