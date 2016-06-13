<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="java.util.List, ec.edu.epn.modelo.*, ec.edu.epn.controlador.BuscarNoticia, java.text.DateFormat,
java.text.ParseException,java.text.SimpleDateFormat;
import java.util.Calendar, java.util.Date, java.util.GregorianCalendar"%>

<jsp:include page="/commons/header1.jsp"></jsp:include>

<section class="container">
	<!-- Main Content -->


	<form action="BuscarNoticiaBasket" method="get">
		<h2>Noticias de Basket</h2>
		<button type="submit" class="btn btn-primary btn-xs">Enterate</button>
	</form>
	<hr>
	<h3>
		<a
			href="${pageContext.request.contextPath}/Vistas/Deportes/BasketEntrenadores.jsp">Entrenadores</a>
	</h3>
	<hr>
	<h3>
		<a
			href="${pageContext.request.contextPath}/Vistas/Deportes/BasketEntrenamientos.jsp">Entrenamientos</a>
	</h3>


	<hr>
	<article>
		<div class="container">
			<div class="row">
				<div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
					<table style="border-collapse: separate; border-spacing: 6px;">
						<tr>
							<th>Titular</th>
							<th>Informaci&oacute;n</th>
						</tr>
						<%
							List<Noticia> noticias = (List<Noticia>) request.getAttribute("NOTICIAS");
							SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
							if (noticias != null) {
								for (Noticia l : noticias) {		
						%>
						<tr>
							<td><%=l.getTituloNoticia()%></td>
							<td><%=l.getInformacion()%></td>
						</tr>
						<%
							} 
								}
							
						%>

					</table>
					<hr>
					<hr>

					<span class="caption text-muted">El baloncesto es ejercicio
						muy completo que desarrolla habilidades como equilibrio,
						concentraci&oacute;n, autocontrol, personalidad, confianza y rapidez de
						ejecuci&oacute;n, agilidad muscular y reflejos precisos que benefician la
						salud.</span>

				</div>
			</div>
		</div>
	</article>

	<hr>

	<ul class="pager">
		<li class="next"><a
			href="${pageContext.request.contextPath}/Vistas/Noticias/Noticias.jsp">Regresar
				&larr;</a></li>
	</ul>

	<hr>
</section>
<jsp:include page="/commons/footer.jsp"></jsp:include>