/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.javaweb.lab;

import ar.javaweb.entides.Persona;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author a211589
 */
public class ResponderAjax implements Action{

    private ArrayList<Persona> personas = new ArrayList<>();
    @Override
    public String executar(HttpServletRequest req, HttpServletResponse resp){
        
                
		resp.setContentType( "text/html; charset=UTF-8");
                PrintWriter out;
                try{
                    out = resp.getWriter();
                }catch(IOException e){
                   return "/eduitjwcurse/labpages/errorpage.jsp";
                }

		// Obtengo los datos de la peticion
		String nombre = req.getParameter("nombre");
		String apellido = req.getParameter("apellido");
		String edad = req.getParameter("edad");

		// Compruebo que los campos del formulario tienen datos para añadir a la tabla
		if (!nombre.equals("") && !apellido.equals("") && !edad.equals("")) {
			// Creo el objeto persona y lo añado al arrayList
			Persona persona = new Persona(nombre, apellido, edad);
			personas.add(persona);
		}

		out.println("<table class=\"table table-striped\">");
		out.println("<tr>");
		out.println("<td> NOMBRE </td>");			
		out.println("<td>APELLIDO</td>");
		out.println("<td>EDAD</td>");
		out.println("</tr>");
		for(int i=0; i<personas.size(); i++){
			Persona persona = personas.get(i);
			out.println("<tr>");
                            out.println("<td>"+persona.getName()+"</td>");			
                            out.println("<td>"+persona.getLastName()+"</td>");
                            out.println("<td>"+persona.getAge()+"</td>");
			out.println("</tr>");
		}
		out.println("</table>");

	

        return null;
    }
    
    
    
}
