<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="Header.jsp"/>
<%@page import="ar.javaweb.entides.Alumno" %>
    <div> 
        <% 
            String aModifId = "";		
            String aModifName="";
            String aModifLastName="";
            String act= "ctr/insertar";
            if (session.getAttribute("aModif")!=null){
                Alumno alum=(Alumno)session.getAttribute("aModif");
                aModifId=String.valueOf(alum.getId());
                aModifName=alum.getName();
                aModifLastName=alum.getLastName();
                act= "ctr/modificar";
            }
        %>
        <br>
        <form method="post" action="<%=act%>">
	    <input type="hidden" name = "id"  value="<%=aModifId%>">
            Nombre: <input type="text" name="name" value="<%=aModifName%>">
            Apellido <input type="text" name="lastName" value = "<%=aModifLastName%>">
            <input type="submit" value="Aceptar">
        </form>
        <br>
        <%if (session.getAttribute("aModif")!=null){ session.removeAttribute("aModif");
        }%>
    </div>
<jsp:include page="Footer.jsp"/>