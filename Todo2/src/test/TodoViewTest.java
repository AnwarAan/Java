package test;

import repository.TodoRepository;
import repository.TodoRepositoryImpl;
import service.TodoService;
import service.TodoServiceImpl;
import view.TodoView;

public class TodoViewTest {
  public static void main(String[] args) {
    // testShowTodo();
    // testAddTodo();
    testRemoveTodo();
  }

  public static void testShowTodo() {
    TodoRepository todoRepository = new TodoRepositoryImpl();
    TodoService todoService = new TodoServiceImpl(todoRepository);
    TodoView todoView = new TodoView(todoService);

    todoService.addTodo("One");
    todoService.addTodo("Two");

    todoView.showTodo();
  }

  public static void testAddTodo() {
    TodoRepository todoRepository = new TodoRepositoryImpl();
    TodoService todoService = new TodoServiceImpl(todoRepository);
    TodoView todoView = new TodoView(todoService);

    todoView.addTodo();
    todoService.showTodo();
  }

  public static void testRemoveTodo() {
    TodoRepository todoRepository = new TodoRepositoryImpl();
    TodoService todoService = new TodoServiceImpl(todoRepository);
    TodoView todoView = new TodoView(todoService);

    todoService.addTodo("One");
    todoService.addTodo("Two");
    todoService.addTodo("Three");
    todoService.addTodo("Four");
    todoService.addTodo("Five");

    todoService.showTodo();
    todoView.removeTodo();
    todoService.showTodo();

  }
}
