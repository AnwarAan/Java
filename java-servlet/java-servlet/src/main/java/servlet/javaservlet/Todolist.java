package servlet.javaservlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/todolist")
public class Todolist extends HttpServlet {
  private List<String> todos = new ArrayList<>();

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    resp.getWriter().println(todos);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    String todo = req.getParameter("todo");
    if (todo != null) {
      todos.add(todo);
      resp.getWriter().println("Add Todo : " + todo);
    } else {
      resp.getWriter().println("Todo params must be exist");
    }
  }
}
