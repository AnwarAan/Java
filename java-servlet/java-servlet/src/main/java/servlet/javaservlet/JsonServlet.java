package servlet.javaservlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/json")
public class JsonServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    String json = """
        {
            "name" : "Eko",
            "value" : 100
        }
        """;
    resp.setHeader("Content-Type", "application/json");
    resp.getWriter().println(json);
  }
}
