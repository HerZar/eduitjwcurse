<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="ar.javaweb.entides.Alumno" %>
<jsp:include page="Header.jsp"/>
    <div class="container">
        <br>
        <form action="ctr/search" method="post">
            <p> Id: <input type="number" name="buscarId"></p>
            <p>Nombre: <input type="text" name="buscarNombre"></p>
            <p>Apellido <input type="text" name="buscarApellido"></p>
            <input type="submit" value="Buscar"  class="btn btn-primary">
        </form>
        <br>
        <form action="alta_modif.jsp" method="post" name="btnAgregar">
            <input type="submit" value="Agregar"  class="btn btn-primary">
        </form>
        
        <c:if test='${sessionScope.lista!=null}'>
            <table class="table table-striped">
                <tr>
                    <td>#</td>
                    <td>ID</td>
                    <td>NOMBRE</td>
                    <td>APELLIDO</td>
                    <td>ADMINISTRACIÓN</td>
                </tr>        
                <c:set var="i" value="0"/>
                <c:forEach var="alumno" items='${sessionScope.lista}'>
                    <!-- los JSTL infieren automaticamente el tipo de datos en este caso
                    un integer...-->
                    <c:set var="i" value="${i+1}"/>
                <tr>
                    <!--en JSTL la pagina infiere el tipo de dato que de una variable
                    no hace falta castear como si lo es con scriptlet
                    tampoco es necesario llamar a los metodos get y set de un objeto
                    mientras que la clase tenga definidos sus getters y setters como un pojo
                    para acceder a ellos unicamente hace falta invocar a su atributo.-->
                    <td><c:out value="${i}"/></td>
                    <td><c:out value="${alumno.id}"/></td>
                    <td><c:out value="${alumno.name}"/></td>
                    <td><c:out value="${alumno.lastName}"/></td>
                    <td>
                        <form action="ctr/delete" method="post">
                            <input type="hidden" name="id" value="${alumno.id}">
                            <input type="submit" value="Borrar"  class="btn btn-primary">
                        </form>
                        <form action="ctr/search_for_update" method="post">
                            <input type="hidden" name="buscarId" value="${alumno.id}">
                            <input type="submit" value="Modificar"  class="btn btn-primary">
                        </form>
                    </td>
                </tr>    
                </c:forEach>
                
            </table>
        </c:if>
    </div>
<jsp:include page="Footer.jsp"/>