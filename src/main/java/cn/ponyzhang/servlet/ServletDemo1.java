package cn.ponyzhang.servlet;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class ServletDemo1 implements Servlet {
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init方法执行");
    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service方法执行");
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String method = request.getMethod();
    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {
        System.out.println("destroy方法执行");
    }

    public static void main(String[] args) {
        System.out.println(1);
    }
}
