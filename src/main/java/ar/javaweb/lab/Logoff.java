/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.javaweb.lab;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author a211589
 */
public class Logoff implements Action {

    @Override
    public String executar(HttpServletRequest req, HttpServletResponse resp) {
        req.getSession().invalidate();
        return "/eduitjwcurse/labpages/labclase3login.jsp";
    }
    
}
