package cn.ponyzhang.servlet;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class SessionServlet extends BaseServlet{

    protected void createOrGetSession(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        HttpSession session = req.getSession();
        boolean isNew = session.isNew();
        String id = session.getId();
        resp.getWriter().println("session的Id是" + id);
        resp.getWriter().println("session是否是新创建" + isNew);
    }
    protected void setAttribute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        HttpSession session = req.getSession();
        session.setAttribute("key1","value1");
        resp.getWriter().println("向session中保存数据" + "key1");
    }
    protected void getAttribute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        HttpSession session = req.getSession();
        Object key1 = session.getAttribute("key1");
        resp.getWriter().println("从session中获取数据" + key1);
    }

    protected void defaultLife(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        HttpSession session = req.getSession();
        int maxInactiveInterval = session.getMaxInactiveInterval();
        resp.getWriter().println("session默认的超时时间" + maxInactiveInterval);
    }

    protected void life3s(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        HttpSession session = req.getSession();
        session.setMaxInactiveInterval(3);
        resp.getWriter().println("设置session的超时时间为" + 3);
    }

    protected void deleteNow(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        HttpSession session = req.getSession();
        session.invalidate();
        resp.getWriter().println("session立即删除" );
    }
}
