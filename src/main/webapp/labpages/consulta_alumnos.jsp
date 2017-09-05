<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="ar.javaweb.entides.Alumno" %>
<jsp:include page="Header.jsp"/>
    <div> 
        <br>
        <form action="ctr/search" method="post">
            Id: <input type="number" name="buscarId">
            Nombre: <input type="text" name="buscarNombre">
            Apellido <input type="text" name="buscarApellido">
            <input type="submit" value="Buscar">
        </form>
        <br>
        <form action="alta_modif.jsp" method="post" name="btnAgregar">
            <input type="submit" value="Agregar">
        </form>
            <table border = 1>
                <tr>
                    <td>#</td>
                    <td>ID</td>
                    <td>NOMBRE</td>
                    <td>APELLIDO</td>
                    <td>ADMINISTRACIÓN</td>
                </tr>        

                <%
                  
                ArrayList<Alumno> testing= (ArrayList<Alumno>)session.getAttribute("lista");
                if (testing!=null){  
                for (int i =0;i<testing.size();i++){    %>
                <tr>
                    <td><%=i%></td>
                    <td><%=testing.get(i).getId()%></td>
                    <td><%=testing.get(i).getName()%></td>
                    <td><%=testing.get(i).getLastName()%></td>
                    <td>
                        <form action="ctr/delete" method="post">
                            <input type="hidden" name="id" value="<%=testing.get(i).getId()%>">
                            <input type="submit" value="Borrar">
                        </form>
                        <form action="ctr/search_for_update" method="post">
                            <input type="hidden" name="buscarId" value="<%=testing.get(i).getId()%>">
                            <input type="submit" value="Modificar">
                        </form>
                    </td>
                </tr>    
                <%}
            }%>
        </table>

    </div>
<jsp:include page="Footer.jsp"/>