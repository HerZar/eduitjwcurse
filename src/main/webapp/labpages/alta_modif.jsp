<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="Header.jsp"/>
<%@page import="ar.javaweb.entides.Alumno" %>
    <div> 
        <br>
        <form method="post" action="ctr/insertar">
            Nombre: <input type="text" name="name">
            Apellido <input type="text" name="lastName">
            <input type="submit" value="Aceptar">
        </form>
        <br>
        
    </div>
<jsp:include page="Footer.jsp"/>