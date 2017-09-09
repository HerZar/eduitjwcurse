package ar.javaweb.servlet;

import ar.javaweb.lab.Action;
import ar.javaweb.lab.Borrar;
import ar.javaweb.lab.Buscar;
import ar.javaweb.lab.BuscarParaModificar;
import ar.javaweb.lab.Insertar;
import ar.javaweb.lab.Logoff;
import ar.javaweb.lab.LoguinUser;
import ar.javaweb.lab.Modificar;
import ar.javaweb.lab.Registrar;
import ar.javaweb.lab.ResponderAjax;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

public class Controler extends HttpServlet {

    private HashMap<String, Action> actions;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url = req.getRequestURI().toString();
        String[] split = url.split("/");
        String command = split[split.length-1];

        Action a = actions.get(command);
        String redirect = a.executar(req,resp);
        if (redirect != null){
            resp.sendRedirect(redirect);
        }
        

    }

    @Override
    public void init() throws ServletException {
        actions = new HashMap<>();
        actions.put("login",new LoguinUser());
        actions.put("logoff",new Logoff());
        actions.put("registrar", new Registrar());
        actions.put("insertar", new Insertar());
        actions.put("search", new Buscar());
        actions.put("delete", new Borrar());
        actions.put("search_for_update", new BuscarParaModificar());
        actions.put("modificar", new Modificar());
        actions.put("respajax", new ResponderAjax());
    }
}
