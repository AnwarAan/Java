package servlet.javaservlet;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet(urlPatterns = "/counter")
public class CounterServlet extends HttpServlet {
  private final AtomicLong atomicLong = new AtomicLong();

  @Override
  public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    long total = atomicLong.incrementAndGet();
    String response = "Total - " + total;
    res.getWriter().println(response);
  }
}
