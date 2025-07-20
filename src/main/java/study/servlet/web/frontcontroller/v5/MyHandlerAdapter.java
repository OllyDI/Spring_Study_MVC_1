package study.servlet.web.frontcontroller.v5;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import study.servlet.web.frontcontroller.ModelView;

import java.io.IOException;

public interface MyHandlerAdapter {

    boolean supports(Object handler);

    ModelView handle(HttpServletRequest req, HttpServletResponse res, Object handler) throws ServletException, IOException;
}
