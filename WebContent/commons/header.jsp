<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Liga Deportiva Polit&eacute;cnica de Quito</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css">
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) --> 

</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid"> 
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#myInverseNavbar2"> <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
      <a class="navbar-brand" href="${pageContext.request.contextPath}/vistas/Principal.jsp">Inicio</a> </div>
    <div class="collapse navbar-collapse" id="myInverseNavbar2">
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#">Eventos</a></li>
        <li><a href="#">Videos</a></li>
        <li><a href="galeria.html">Galer&iacute;a</a></li>
		<li class="dropdown"> <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Clubes<span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">
            <li><a href="Atletismo.html">Atletismo</a></li>
			<li><a href="Futbol.html">F&uacute;tbol</a></li>
            <li><a href="Rugby.html">Rugby</a></li>
			<li><a href="Voleyball.html">Voleyball</a></li>
          </ul>
        </li>
        <li class="dropdown"> <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Mas <span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">
            <li><a href="Noticias.html">Noticias</a></li>
			<li><a href="Contactos.html">Contactos</a></li>
            <li class="divider"></li>
            <li><a href="#">Ayuda</a></li>
          </ul>
        </li>
      </ul>
    </div>
  </div>
</nav>

