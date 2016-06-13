<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, ec.edu.epn.modelo.*, ec.edu.epn.controlador.BuscarNoticia, java.text.DateFormat,
java.text.ParseException,java.text.SimpleDateFormat;
import java.util.Calendar, java.util.Date, java.util.GregorianCalendar" %>

<jsp:include page="/commons/header1.jsp"></jsp:include>

<section class="container">
<!-- Main Content -->

      
      <form action="BuscarNoticia" method="get">
      <h3>Entrenadores</h3>
      <button type="submit" class="btn btn-primary btn-xs">Conocelos</button>
      </form>
      <hr>
	<article>
		<div class="container">
			<div class="row">
				<div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
					<table style="border-collapse: separate; border-spacing: 6px;">
						<tr>
							<th></th>
							<th></th>
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
				 
 						 <span class="caption text-muted">El Atletismo puede influir en la mayor&iacute;a de las funciones org&aacute;nicas. Todo apunta hacia una mejora general del estado f&iacute;sico y mental.</span>

				</div>
			</div>
		</div>
	</article>

	<hr>



    <hr>
</section>
<jsp:include page="/commons/footer.jsp"></jsp:include>