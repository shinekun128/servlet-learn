package cn.ponyzhang.servlet;

import org.apache.catalina.connector.RequestFacade;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyHttpServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestFacade requestFacade = (RequestFacade)req;
        resp.getWriter().println("hello tomcat");
    }
}
