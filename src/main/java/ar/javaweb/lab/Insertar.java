/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.javaweb.lab;

import ar.javaweb.database.AlumnoDao;
import ar.javaweb.database.SessionManager;
import ar.javaweb.entides.Alumno;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author a211589
 */
public class Insertar implements Action{

    @Override
    public String executar(HttpServletRequest req, HttpServletResponse resp) {
        AlumnoDao daoAlumno = new AlumnoDao(SessionManager.getSessionFactory());
        Alumno alumn= new Alumno(req.getParameter("name"), req.getParameter("lastName"));
        daoAlumno.save(alumn);
        return "/eduitjwcurse/labpages/consulta_alumnos.jsp";
    }
    
    
    
}
