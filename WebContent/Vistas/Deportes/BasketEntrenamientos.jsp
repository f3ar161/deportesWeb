<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="java.util.List, ec.edu.epn.modelo.*, ec.edu.epn.controlador.BuscarNoticia, java.text.DateFormat,
java.text.ParseException,java.text.SimpleDateFormat;
import java.util.Calendar, java.util.Date, java.util.GregorianCalendar"%>

<jsp:include page="/commons/header1.jsp"></jsp:include>

<section class="container">
	<!-- Main Content -->


	<form action="BuscarEntrenamientoBasket" method="get">
		<h3>Entrenamiento</h3>
		<button type="submit" class="btn btn-primary btn-xs">Conocelos</button>
	</form>
	<hr>
	<article>
		<div class="container">
			<div class="row">
				<div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
					<table style="border-collapse: separate; border-spacing: 15px;">
						<tr>
							<th>Descripci&oacute;n</th>
							<th>Tipo de entrenador</th>
							<th>Fecha</th>
							<th>Hora</th>
							<th>Entrenador</th>
							

						</tr>
						<%
							List<Entrenamiento> entrenamientos = (List<Entrenamiento>) request.getAttribute("ENTRENAMIENTOS");
							DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
							DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
							if (entrenamientos != null) {
								for (Entrenamiento l : entrenamientos) {		
						%>
						<tr>
							<td><%=l.getDescripcionEntrenamiento()%></td>
							<td><%=l.getLugarEntrenamiento()%></td>
							<td><%=dateFormat.format(l.getFechaEntrenamiento()) %></td>
							<td><%=hourFormat.format(l.getHoraEntrenamiento()) %></td>
							<td><%=l.getEntrenador().getNombreEntrenador()%></td>

						</tr>
						<%
							} 
								}
							
						%>

					</table>
					<hr>
					<hr>

					<span class="caption text-muted">El ejercicio f&iacute;sico, ya sea
						de corta o larga duraci&oacute;n, contribuye a establecer un bienestar
						mental, mejorando la autonom&iacute;a de la persona, la memoria, rapidez
						de ideas, etc&iecute;tera, y promoviendo sensaciones como el optimismo o
						la euforia, al tiempo que se mejora la autoestima de las personas,
						lo que produce beneficios en diferentes enfermedades como la
						osteoporosis, la hipertensi&oacute;n o las crisis diab&eacute;ticas.</span>

				</div>
			</div>
		</div>
	</article>

	<hr>
		<ul class="pager">
                    <li class="next">
                        <a href="${pageContext.request.contextPath}/Vistas/Deportes/Basket.jsp">Regresar &larr;</a>
                    </li>
                </ul>


    <hr>

	<hr>
</section>
<jsp:include page="/commons/footer.jsp"></jsp:include>