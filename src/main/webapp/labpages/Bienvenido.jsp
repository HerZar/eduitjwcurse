<%-- 
    Document   : Bienvenido
    Created on : Aug 31, 2017, 11:29:42 AM
    Author     : a211589
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="ar.javaweb.entides.Usuario" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
        <title>Bienvenido</title>
    </head>
    <body>
        <%Usuario usuario = (Usuario) session.getAttribute("user");%>
        <h1>Nombre: <%=usuario.getName()%>, <%=usuario.getLastName()%></h1>
        
        <form method="post" action="ctr/logoff">
            <input type="submit" value="Logoff">
        </form>
        
    </body>
</html>
