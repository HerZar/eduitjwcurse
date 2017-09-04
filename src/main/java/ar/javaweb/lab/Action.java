package ar.javaweb.lab;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {
    public String executar(HttpServletRequest req, HttpServletResponse resp);
}
