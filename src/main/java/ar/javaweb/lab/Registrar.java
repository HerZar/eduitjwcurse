package ar.javaweb.lab;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Registrar implements Action{
    @Override
    public String executar(HttpServletRequest req, HttpServletResponse resp) {

        
        return  "/eduitjwcurse/labpages/registrado.jsp";

    }
}
