package web_homework_cookies;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LogoutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        if (cookies==null) return;
        for (Cookie c: cookies) {
            //remove all cookies
            c.setMaxAge(0);
            resp.addCookie(c);

            //remove special one
//            if (c.getName().equals("bbb")){
//                c.setMaxAge(0);
//                resp.addCookie(c);
//            }
        }
    }
}
