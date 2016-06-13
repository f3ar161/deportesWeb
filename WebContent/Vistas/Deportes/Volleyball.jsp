<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="java.util.List, ec.edu.epn.modelo.*, ec.edu.epn.controlador.BuscarNoticia, java.text.DateFormat,
java.text.ParseException,java.text.SimpleDateFormat;
import java.util.Calendar, java.util.Date, java.util.GregorianCalendar"%>

<jsp:include page="/commons/header1.jsp"></jsp:include>

<section class="container">
	<!-- Main Content -->


	<form action="BuscarNoticiaVolleyball" method="get">
		<h2>Noticias de V&oacute;leibol</h2>
		<button type="submit" class="btn btn-primary btn-xs">Enterate</button>
	</form>
	<hr>
	<h3>
		<a
			href="${pageContext.request.contextPath}/Vistas/Deportes/VolleyballEntrenadores.jsp">Entrenadores</a>
	</h3>
	<hr>
	<h3>
		<a
			href="${pageContext.request.contextPath}/Vistas/Deportes/VolleyballEntrenamientos.jsp">Entrenamientos</a>
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

					<span class="caption text-muted">Una caracter&iacute;stica
						interesante del voley es que, al ser un deporte sedentario,es
						decir, con poco traslado, es menos exigente a nivel
						cardiovascular, lo cual es positivo si es que hace mucho que no
						haces actividad f&iacute;sica. Se trata de un deporte m&aacute;s amable en ese
						sentido y a nivel fuerza, puesto que no hay contacto.</span>

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