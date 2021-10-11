package cn.ponyzhang.servlet;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends BaseServlet{

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if("ZQK123".equals(username) && "123456".equals(password)){
            Cookie cookie = new Cookie("username","ZQK123");
            cookie.setMaxAge(60 * 60 * 24 * 7);
            resp.addCookie(cookie);
            resp.getWriter().println("cookie设置成功");
        }else{
            System.out.println("登录失败");
        }

    }

}
