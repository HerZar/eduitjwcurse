/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.javaweb.lab;

import ar.javaweb.entides.Persona;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author a211589
 */
public class ResponderAjaxLista implements Action{
    
        private ArrayList<Persona> personas = new ArrayList<>();
    @Override
    public String executar(HttpServletRequest req, HttpServletResponse resp){
        
                
		String nombre = req.getParameter("nombre");
		String apellido = req.getParameter("apellido");
		String edad = req.getParameter("edad");

		// Compruebo que los campos del formulario tienen datos para añadir a la tabla
		if (!nombre.equals("") && !apellido.equals("") && !edad.equals("")) {
			// Creo el objeto persona y lo añado al arrayList
			Persona persona = new Persona(nombre, apellido, edad);
			personas.add(persona);
		}
	
                req.getSession().setAttribute("personas", personas);

        return null;
    }
    
    
}
