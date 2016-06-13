<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="java.util.List, ec.edu.epn.modelo.*, ec.edu.epn.controlador.BuscarNoticia, java.text.DateFormat,
java.text.ParseException,java.text.SimpleDateFormat;
import java.util.Calendar, java.util.Date, java.util.GregorianCalendar"%>

<jsp:include page="/commons/header1.jsp"></jsp:include>
<section class="container">
	<!-- Main Content -->
	
			<div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">

				<form action="BuscarNoticiaTituloAtletismo" method="get">
					<h2>Alguna noticia en especial?</h2>
					Burcar por Titulo: <input type="text" name="nombreBusqueda" />
					<button type="submit" class="btn btn-primary btn-xs">Buscar</button>
				</form>
				<hr>


				<div class="panel-group">
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a data-toggle="collapse" href="#collapse1">Deportes</a>
							</h4>
						</div>


						<div id="collapse1" class="panel-collapse collapse">
							<ul class="list-group">

								<li class="list-group-item"><a
									href="${pageContext.request.contextPath}/Vistas/Deportes/Atletismo.jsp">Atlet&iacute;smo</a></li>

								<li id="2" title="deporteID" class="list-group-item"><a
									href="${pageContext.request.contextPath}/Vistas/Deportes/Futbol.jsp">F&uacute;tbol</a></li>
								<li id="3" title="deporteID" class="list-group-item"><a
									href="${pageContext.request.contextPath}/Vistas/Deportes/Basket.jsp">Basket</a></li>
								<li id="4" title="deporteID" class="list-group-item"><a
									href="${pageContext.request.contextPath}/Vistas/Deportes/Rugby.jsp">Rugby</a></li>
								<li id="5" title="deporteID" class="list-group-item"><a
									href="${pageContext.request.contextPath}/Vistas/Deportes/Volleyball.jsp">Volleyball</a></li>
							</ul>
						</div>

					</div>

				</div>

				<hr>

				<hr>
		
								<table style="border-collapse: separate; border-spacing: 6px;">
									<tr>
										<th></th>
										<th></th>
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

							</div>

		<hr>
</section>
<jsp:include page="/commons/footer.jsp"></jsp:include>