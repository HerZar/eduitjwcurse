<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:include page="Header.jsp"/>
<div class="container">
        <h1>Login Usuario</h1>
        <hr/>
        
        <form method="post" action="ctr/login">
            Id usuario: <input type="text" name="idUser"><br><br>
            Clave usuario: <input type="password" name="pasUser"><br><br>            
            <input type="submit" value="Acceder" class="btn btn-primary">
            
        </form>
        <%String mensaje = (String)session.getAttribute("msg");
        if (mensaje!= null){
        %>
        <p> <%=session.getAttribute("msg")%> </p>
        <%}
            session.removeAttribute("msg");%>        
            </div>
<jsp:include page="Footer.jsp"/>