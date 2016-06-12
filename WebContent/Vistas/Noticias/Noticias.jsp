<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
<jsp:include page="/commons/header1.jsp"></jsp:include>
<section class="container">
<!-- Main Content -->
    <div class="container">
       
        <div class="row">
            <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
                   <div class="panel-group">
  					 <div class="panel panel-default">
    				<div class="panel-heading">          					 
      				<h4 class="panel-title">
        				<a data-toggle="collapse" href="#collapse1">Deportes</a>
      				</h4>
    				</div>
    				
    				<div id="collapse1" class="panel-collapse collapse">
      				  <ul class="list-group">
        				<li  id="1" title="deporteID" class="list-group-item"> <a href="${pageContext.request.contextPath}/Vistas/Deportes/Atletismo.jsp" >Atlet&iacute;smo</a></li>
        				<li  id="2" title="deporteID" class="list-group-item"><a href="#" >F&uacute;tbol</a></li>
        				<li  id="3" title="deporteID" class="list-group-item"><a href="#" >Basket</a></li>
        				<li  id="4" title="deporteID" class="list-group-item"><a href="#" >Rugby</a></li>
        				<li  id="5" title="deporteID" class="list-group-item"><a href="#" >Volleyball</a></li>
				      </ul>
      				</div>
      				
			  		</div>
			  		
			  		</div>
			  	
			<hr>
 
                
                <hr>
               
            </div>
        </div>

    </div>

    <hr>
</section>
<jsp:include page="/commons/footer.jsp"></jsp:include>