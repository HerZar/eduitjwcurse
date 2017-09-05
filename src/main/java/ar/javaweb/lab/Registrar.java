package ar.javaweb.lab;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Registrar implements Action{
    @Override
    public String executar(HttpServletRequest req, HttpServletResponse resp) {

        String nombre = req.getParameter("name");
        String apellido = req.getParameter("lastname");
        String direccion = req.getParameter("address");
        String sexo = req.getParameter("sex");
        String puesto = req.getParameter("job");
        String tieneExp = req.getParameter("exp");

        req.getSession().setAttribute("name",nombre);
        req.getSession().setAttribute("lastname",apellido);
        req.getSession().setAttribute("address",direccion);
        req.getSession().setAttribute("sex",sexo);
        req.getSession().setAttribute("job",puesto);
        req.getSession().setAttribute("exp",tieneExp);

        return  "/eduitjwcurse/labpages/registrado.jsp";

    }
}
