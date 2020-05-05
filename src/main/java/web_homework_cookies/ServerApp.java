package web_homework_cookies;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.FilterHolder;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import javax.servlet.DispatcherType;
import java.util.EnumSet;

public class ServerApp {
    private static final EnumSet<DispatcherType> ft = EnumSet.of(DispatcherType.REQUEST);

    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);
        ServletContextHandler handler = new ServletContextHandler();

        Calculator calc=new Calculator();

        handler.addServlet(new ServletHolder(new LoginServlet()),"/calc/login/*");
        handler.addServlet(new ServletHolder(new LogoutServlet()),"/calc/logout/*");

        handler.addServlet(new ServletHolder(new CalcServlet(calc)),"/calc/do/*");
        handler.addFilter(new FilterHolder(new CalculatorFilter(calc)), "/calc/do", ft);

        handler.addServlet(new ServletHolder(new HistoryOpServlet()),"/calc/history/*");


        server.setHandler(handler);
        server.start();
        server.join();
    }
}

