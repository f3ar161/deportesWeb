<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, ec.edu.epn.modelo.*" %>

<jsp:include page="/commons/header1.jsp"></jsp:include>

<section class="container">
<!-- Main Content -->
   

      <h2>Noticias de Atletismo</h2>
        <h2>Busqueda</h2>
    
		<form action="BuscarNoticia" method="get">
         Nombre: <input type="text" name="nombreBusqueda" />
         <input type="submit" value="Buscar"/> 
     </form>
		
		     <table>
        <tr>
          
           <th>Nombre</th>
         
        </tr>
        <%
          List<Noticia> noticias = (List<Noticia>)request.getAttribute("NOTICIAS");
          if (noticias!=null){
            for(Noticia l: noticias) {
        %>
         <tr>
           <td><%= l.getTituloNoticia() %></td>
           
         </tr>
          <%
           }
          }
        %>
     </table>
             
            
       <p>vas</p>
       
        
        
       <article>
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
                    <p>Never in all their history have men been able truly to conceive of the world as one: a single sphere, a globe, having the qualities of a globe, a round earth in which all the directions eventually meet, in which there is no center because every point, or none, is center — an equal earth which all men occupy as equals. The airman's earth, if free men make it, will be truly round: a globe in practice, not in theory.</p>                   
                    
                    <a href="#">
                        <img class="img-responsive" src="${pageContext.request.contextPath}/img/atlet.jpg" alt="">
                    </a>
                    <span class="caption text-muted">To go places and do things that have never been done before – that’s what living is all about.</span>

                    <p>Space, the final frontier. These are the voyages of the Starship Enterprise. Its five-year mission: to explore strange new worlds, to seek out new life and new civilizations, to boldly go where no man has gone before.</p>

                    <p>As I stand out here in the wonders of the unknown at Hadley, I sort of realize there’s a fundamental truth to our nature, Man must explore, and this is exploration at its greatest.</p>

                    <p>Placeholder text by <a href="http://spaceipsum.com/">Space Ipsum</a>. Photographs by <a href="https://www.flickr.com/photos/nasacommons/">NASA on The Commons</a>.</p>
                </div>
            </div>
        </div>
    </article>

    <hr>



    <hr>
</section>
<jsp:include page="/commons/footer.jsp"></jsp:include>