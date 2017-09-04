<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
        <title>Laboratorio Clase2</title>
    </head>
    <body>
        <h1>Formulario de inscripción</h1><br>
        <hr/>
        <form method="post" action="ctr/registrar">
            Nombre:     <input type="text" name="name"><br><br>
            Apellido:   <input type="text" name="lastname"><br><br>
            Dirección:  <input type="text" name="address"><br><br>
            Sexo: Masculino <input type="radio" name="sex" value="M">
            Femenino   <input type="radio" name="sex" value="F"><br><br>
            Puesto de trabajo: <select name="job">
				<option value="Empty"></option>
                <option value="Programador">Programador</option>
                <option value="Analista funcional">Analista funcional</option>
                <option value="Diseñaador">DiseÃ±ador</option>
                <option value="Lider de proyecto">Lider de proyecto</option>
            </select><br><br>
            Tiene experiencia: <input type="checkbox" name="exp" value="si"><br><br>
		<hr/>
			<input type="submit" value="Registrarme!">


        </form>

    </body>
</html>
