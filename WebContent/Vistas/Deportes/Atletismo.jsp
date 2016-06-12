<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ page import="java.util.List, ec.edu.epn.modelo.Noticia" %>
<jsp:include page="/commons/header1.jsp"></jsp:include>
<section class="container">
<!-- Main Content -->
   
      <form action="BuscarNoticia" method="get">
       
         ID: <input type="text" name="deporteID" />
         <input type="submit" value="Buscar"/> 
     </form>
  
        <%
          List<Noticia> noticias = (List<Noticia>) request.getAttribute("NOTICIAS");
          if (noticias!=null){
        	  for(Noticia n: noticias) {
        %>
         <tr>
           <td><%= n.getTituloNoticia() %></td>
      
         </tr>
          <%
           }
          }
        %>
       <p>vas</p>



    <hr>
</section>
<jsp:include page="/commons/footer.jsp"></jsp:include>