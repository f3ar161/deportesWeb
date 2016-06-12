<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:include page="/commons/header.jsp"></jsp:include>
<section>
    <!-- Main Content -->
    <div class="container">
        <div class="row">
            <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
                <div class="post-preview">
                    <a href="${pageContext.request.contextPath}/Vistas/Deportes/Atletismo.jsp">
                        <h2 class="post-title">
                            Noticas sobre Atletismo
                        </h2>
                        <h3 class="post-subtitle">
                            Todo referente a noticias de Atletismo
                        </h3>
                    </a>
                    <p class="post-meta">LDPQ. - Liga Deportiva Polit&eacute;nica Quito</p>
                </div>
                <hr>
                <div class="post-preview">
                    <a href="${pageContext.request.contextPath}/Vistas/Deportes/Futbol.jsp">
                        <h2 class="post-title">
                            Noticas sobre Futbol
                        </h2>
                        <h3 class="post-subtitle">
                            Todo referente a noticias de Futbol
                        </h3>
                    </a>
                    
                    <p class="post-meta">LDPQ. - Liga Deportiva Polit&eacute;nica Quito</p>
                </div>
                <hr>
                <div class="post-preview">
                    <a href="${pageContext.request.contextPath}/Vistas/Deportes/.jsp">
                        <h2 class="post-title">
                            Enterate de mas el Basket
                        </h2>
                        <h3 class="post-subtitle">
                            Todo referente a noticias de Basket
                        </h3>
                    </a>
                    <p class="post-meta">LDPQ. - Liga Deportiva Polit&eacute;nica Quito</p>
                </div>
                <hr>

                <!-- Pager -->
                <ul class="pager">
                    <li class="next">
                        <a href="${pageContext.request.contextPath}/Vistas/Noticias/Noticias.jsp">Mas noticas &rarr;</a>
                    </li>
                </ul>
            </div>
        </div>
    </div>

    <hr>
</section>
<jsp:include page="/commons/footer.jsp"></jsp:include>