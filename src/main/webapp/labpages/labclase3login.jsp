<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-type" content="text/html" charset="UTF-8"
    </head>
    <body>
        <h1>Login Usuario</h1>
        <hr/>
        
        <form method="post" action="ctr/login">
            Id usuario: <input type="text" name="idUser"><br><br>
            Clave usuario: <input type="password" name="pasUser"><br><br>            
            <input type="submit" value="Acceder">
            
        </form>
        <%String mensaje = (String)session.getAttribute("msg");
        if (mensaje!= null){
        %>
        <p> <%=session.getAttribute("msg")%> </p>
        <%}
            session.removeAttribute("msg");%>        
    </body>
</html>
