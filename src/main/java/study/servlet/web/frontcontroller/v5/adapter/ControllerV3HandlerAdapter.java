package study.servlet.web.frontcontroller.v5.adapter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import study.servlet.web.frontcontroller.ModelView;
import study.servlet.web.frontcontroller.v3.ControllerV3;
import study.servlet.web.frontcontroller.v5.MyHandlerAdapter;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ControllerV3HandlerAdapter implements MyHandlerAdapter {
    @Override
    public boolean supports(Object handler) {
        return (handler instanceof ControllerV3);
    }

    @Override
    public ModelView handle(HttpServletRequest req, HttpServletResponse res, Object handler) throws ServletException, IOException {
        ControllerV3 controller = (ControllerV3) handler;

        Map<String, String> paramMap = createParamMap(req);
        ModelView mv = controller.process(paramMap);

        return mv;
    }

    private static Map<String, String> createParamMap(HttpServletRequest req) {
        Map<String, String> paramMap = new HashMap<>();
        req.getParameterNames().asIterator()
                .forEachRemaining(paramName -> paramMap.put(paramName, req.getParameter(paramName)));
        return paramMap;
    }
}
