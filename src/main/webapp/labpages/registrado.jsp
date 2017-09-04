
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrado ok</title>
    </head>
    <body>
        <h1>El registro se realizo con exito de la siguiente información</h1><br>
        <hr/>
        <%String nombre = (String)session.getAttribute("name");%>
        <%String apellido = (String)session.getAttribute("lastname");%>
        <%String direccion = (String)session.getAttribute("address");%>
        <%String sexo = (String)session.getAttribute("sex");%>
        <%String puesto = (String)session.getAttribute("job");%>
        <%String tieneExp = (String)session.getAttribute("exp");%>
        <% if (nombre !=null){%>
        <ul>
          <li>Nombre:<%=nombre%></li>
          <li>Apellido:<%=apellido%></li>
          <li>Dirección:<%=direccion%></li>
          <li>Sexo:<%=sexo%></li>
          <li>Puesto:<%=puesto%></li>
          <li>Experiencia:<%=tieneExp%></li>
        </ul>
        <%}else{%>
            <h2>no se encontraron datos</h2>
        <%}%>
    </body>
</html>
