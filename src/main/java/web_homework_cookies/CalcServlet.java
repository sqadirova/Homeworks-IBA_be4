package web_homework_cookies;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class CalcServlet extends HttpServlet {

  private Calculator calc;

  public CalcServlet(Calculator calc) {
    this.calc = calc;
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String content = new BufferedReader(new FileReader(new File("content/calc.html"))).lines()
        .collect(Collectors.joining("\n"));

    try (PrintWriter writer = resp.getWriter()) {
      Cookie[] cookies = req.getCookies();
      if (cookies==null){
        writer.write("Please login!");
      }
      else{
        writer.write(content);
      }
    }
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String x = req.getParameter("x");
    String y = req.getParameter("y");
    String op = req.getParameter("op");
    /**
     * right now, because of the CalculatorFilter
     * there is a GUARANTEE that everything is OK
     */

    //add operations to history
   History h=new History();
   h.addToHistory(req,op);

    try (PrintWriter writer = resp.getWriter()) {
      writer.write(calc.doOperation(x,y,op));

    }
  }
}
