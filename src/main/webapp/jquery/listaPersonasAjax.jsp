<%-- 
    Document   : listaPersonasAjax
    Created on : Sep 9, 2017, 6:54:21 PM
    Author     : a211589
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>AJAX JSP Servelts</title>
        <script src="http://code.jquery.com/jquery-latest.js"></script>
	
		
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        
        <script>
                $(document).ready(function() {
                        $('#submit').click(function(event) {
                                var nombreVar = $('#nombre').val();
                                var apellidoVar = $('#apellido').val();
                                var edadVar = $('#edad').val();
                                // Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
                                $.post("ctr/respajax", {
                                        nombre : nombreVar,
                                        apellido: apellidoVar,
                                        edad: edadVar
                                }, function(responseText) {
                                        $('#tabla').html(responseText);
                                });
                        });
                });
        </script>
    </head>
    <body>
            <h2>Ejemplo de AJAX con JSP y Servelts</h2>
            <form id="form1">
                <div  class="col-sm-6">
                    <p>Nombre:<input type="text" id="nombre" /> </p><br>
                    <p>Apellido: <input type="text" id="apellido" /> </p><br>
                    <p>Edad: <input type="text" id="edad" /> </p><br>
                    <input type="button" id="submit" value="Añadir" /> 
                </div>
            </form>
            <br>
            <!-- 	En este div metemos el contenido de la tabla con AJAX -->
            <div id="tabla"></div>
    </body>

</html>
