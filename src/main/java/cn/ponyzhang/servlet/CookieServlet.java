package cn.ponyzhang.servlet;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CookieServlet extends BaseServlet {

    protected void creatCookie(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Cookie cookie = new Cookie("key1","value1");
        resp.addCookie(cookie);
        resp.getWriter().println("cookie设置成功");
    }

    protected void getCookie(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Cookie[] cookies = req.getCookies();
        for(Cookie cookie : cookies){
            resp.getWriter().write("cookie[" + cookie.getName() +"=" + cookie.getValue() + "]<br/>");

        }
    }

    protected void updateCookie(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Cookie cookie = new Cookie("key1", "value2");
        resp.addCookie(cookie);
        resp.getWriter().println("cookie已经修改");
    }

    protected void defaultLifeCookie(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Cookie cookie = new Cookie("life", "life");
        cookie.setMaxAge(-1);
        resp.addCookie(cookie);
        resp.getWriter().println("cookie生命周期");
    }

    protected void deleteNowCookie(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Cookie[] cookies = req.getCookies();
        Cookie newCookie = null;
        for(Cookie cookie : cookies){
            if("key1".equals(cookie.getName())){
                newCookie = new Cookie("key1","newCookie");
            }
        }
        newCookie.setMaxAge(0);
        resp.addCookie(newCookie);
        resp.getWriter().println("立即删除cookie");
    }

    protected void life3600Cookie(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Cookie newCookie =  new Cookie("key3","newCookie");
        newCookie.setMaxAge(3600);
        resp.addCookie(newCookie);
        resp.getWriter().println("设置cookie生命周期3600");
    }

    protected void pathCookie(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Cookie newCookie =  new Cookie("path","path");
        newCookie.setPath(req.getContextPath() + "/abc");
        resp.addCookie(newCookie);
        resp.getWriter().println("设置cookie路径");
    }
}
