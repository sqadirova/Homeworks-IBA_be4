package web_homework_LOGIN;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.stream.Collectors;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String content = new BufferedReader(new FileReader(new File("content/login.html"))).lines()
                .collect(Collectors.joining("\n"));

        try(PrintWriter writer=resp.getWriter()){
            writer.write(content);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("txt/html");

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        try(PrintWriter out=resp.getWriter()){
            if (username.equals("user") && password.equals("123")){
//                RequestDispatcher reqDisp = req.getRequestDispatcher("WelcomeServlet");
//                reqDisp.forward(req,resp);
                resp.sendRedirect("/welcome");
            }else {
                out.write("Sorry wrong username or password!");
                RequestDispatcher reqDisp = req.getRequestDispatcher("login.html");
                reqDisp.include(req,resp);
            }
        }

    }
}
