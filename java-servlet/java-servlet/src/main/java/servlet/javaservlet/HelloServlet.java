package servlet.javaservlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet(urlPatterns = { "/hello", "/world" })
public class HelloServlet extends HttpServlet {
  @Override
  public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    res.getWriter().println("Hello World");
  }
}
