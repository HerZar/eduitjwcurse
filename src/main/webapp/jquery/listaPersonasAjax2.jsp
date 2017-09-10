<%-- 
    Document   : listaPersonasAjax2
    Created on : Sep 10, 2017, 8:44:49 AM
    Author     : a211589
--%>


<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="ar.javaweb.entides.Persona" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>AJAX JSP Servelts</title>
        <script src="http://code.jquery.com/jquery-latest.js">

        </script>
        <script>
                $(document).ready(function() {
                        $('#submit').click(function(event) {
                                var nombreVar = $('#nombre').val();
                                var apellidoVar = $('#apellido').val();
                                var edadVar = $('#edad').val();
                                // Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
                                $.post("ctr/ajaxlista", {
                                        nombre : nombreVar,
                                        apellido: apellidoVar,
                                        edad: edadVar
                                }, function(session.) {
                                    var tablahtml;
                                    	tablahtml="<table class=\"table table-striped\">";
                                        tablahtml=tablahtml+"<tr>";
                                        tablahtml=tablahtml+"<td> NOMBRE </td>";			
                                        tablahtml=tablahtml+"<td>APELLIDO</td>";
                                        tablahtml=tablahtml+"<td>EDAD</td>";
                                        tablahtml=tablahtml+"</tr>";
                                        $.each(${sessionScope.personas}, function(index,persona)){
                                                Persona persona = personas.get(i);
                                                tablahtml=tablahtml+"<tr>";
                                                    tablahtml=tablahtml+"<td><c:out value="${persona.name}"/></td>";			
                                                    tablahtml=tablahtml+"<td><c:out value="${persona.lastName}"/></td>";
                                                    tablahtml=tablahtml+"<td><c:out value="${persona.age}"/></td>";
                                                tablahtml=tablahtml+"</tr>";
                                        }
                                        tablahtml=tablahtml+"</table>";
                                        
                        

                                });
                        });
                });
        </script>
    </head>
    <body>
            <h2>Ejemplo de AJAX con JSP y Servelts</h2>
            <form id="form1">
                    Nombre:<input type="text" id="nombre" /> <br>
                    Apellido: <input type="text" id="apellido" /> <br>
                    Edad: <input type="text" id="edad" /> <br>
                    <input type="button" id="submit" value="Añadir" /> 
            </form>
            <br>
            <!-- 	En este div metemos el contenido de la tabla con AJAX -->
            <div id="tabla"></div>
    </body>

</html>
