/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.javaweb.lab;

import ar.javaweb.entides.Usuario;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author a211589
 */
public class LoguinUser implements Action{

    private ArrayList<Usuario> usuarios;
    public LoguinUser() {
        usuarios = new ArrayList<>();
        usuarios.add(new Usuario("hz", "libra1", "Hernan", "Zarzycki"));
        usuarios.add(new Usuario("sl", "libra2", "Silvia", "Lazarte"));
        usuarios.add(new Usuario("sp", "libra3", "Susana", "Peralta"));
    }

    @Override
    public String executar(HttpServletRequest req, HttpServletResponse resp) {
        if (!isNullOrEmpty(req.getParameter("idUser"))){
            Usuario aux = new Usuario(req.getParameter("idUser"), req.getParameter("pasUser"), "", "");
            for (int i=0;i<usuarios.size();i++){
                if(usuarios.get(i).equals(aux)){
                    req.getSession().setAttribute("user", usuarios.get(i));
                    return "/eduitjwcurse/labpages/Bienvenido.jsp";
                }
            }
        }
        req.getSession().setAttribute("msg", "Usuario y clave incorrecto.");
                return "/eduitjwcurse/labpages/labclase3login.jsp";
    }
    
    private boolean isNullOrEmpty(String s){
        if (s.isEmpty() || (s == null)){
            return true;
        }else{
            return false;
        }
    }
        
}


