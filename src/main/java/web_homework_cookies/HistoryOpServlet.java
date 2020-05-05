package web_homework_cookies;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HistoryOpServlet extends HttpServlet {
    History h=new History();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        try (PrintWriter pw = resp.getWriter()) {
            if (cookies==null){
                pw.write("Please login!");
            }else {
                //show table for all operations for that logged user
//               pw.write(h.represent());
            }
        }
    }
}
