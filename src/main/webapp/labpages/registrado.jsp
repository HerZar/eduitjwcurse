
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrado ok</title>
    </head>
    <body>
        <h1>El registro se realizo con exito de la siguiente información</h1><br>
        <hr/>
        <!--<String nombre = (String)session.getAttribute("name");%>-->
        <c:set var="nombre" value='${sessionScope["name"]}'/>
        <c:set var="apellido" value='${sessionScope["lastname"]}'/>
        <c:set var="direccion" value='${sessionScope["address"]}'/>
        <c:set var="sexo" value='${sessionScope["sex"]}'/>
        <c:set var="puesto" value='${sessionScope["job"]}'/>
        <c:set var="tieneExp" value='${sessionScope["exp"]}'/>
        
        <c:choose>
            <c:when test="${nombre != null}">
                <ul>
                  <li>Nombre:<c:out value="${nombre}"/> </li>
                  <li>Apellido:<c:out value="${apellido}"/></li>
                  <li>Dirección:<c:out value="${direccion}"/></li>
                  <li>Sexo:<c:out value="${sexo}"/></li>
                  <li>Puesto:<c:out value="${puesto}"/></li>
                  <li>Experiencia:<c:out value="${tieneExp}"/></li>
                </ul>
                </c:when>
            <c:otherwise><c:out value="no se encontro informacion"/></c:otherwise>
        </c:choose>
        
    </body>
</html>
