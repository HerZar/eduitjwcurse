/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.javaweb.lab;

import ar.javaweb.database.AlumnoDao;
import ar.javaweb.database.SessionManager;
import ar.javaweb.entides.Alumno;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author a211589
 */
public class Buscar implements Action{

    @Override
    public String executar(HttpServletRequest req, HttpServletResponse resp) {
        
        String buscID = (String)req.getParameter("buscarId");
        String buscNombre = (String)req.getParameter("buscarNombre");
        String buscApellido = (String)req.getParameter("buscarApellido");
        

        AlumnoDao daoAlumn = new AlumnoDao(SessionManager.getSessionFactory());
        List<Alumno> alumnos = new ArrayList<>();
        if ((NullOrEmpty(buscID)) && (NullOrEmpty(buscNombre)) && (NullOrEmpty(buscApellido))){
            alumnos = daoAlumn.getAll();
        }
        
        req.getSession().setAttribute("lista", alumnos);
        return "/eduitjwcurse/labpages/consulta_alumnos.jsp";
    }
    
    private boolean NullOrEmpty(String s){
        if ((s==null)||(s.isEmpty())){
            return true;
        }else{
            return false;
        }
    }

}
