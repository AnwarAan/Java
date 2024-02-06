package test;

import entity.Todo;
import repository.TodoRepository;
import repository.TodoRepositoryImpl;
import service.TodoService;
import service.TodoServiceImpl;

public class TodoServiceTest {
  public static void main(String[] args) {
    // testShowTodo();
    // testAddTodo();
    testRemoveTodo();
  }

  public static void testShowTodo() {
    // TodoRepository todoRepository = new TodoRepositoryImpl();

    TodoRepositoryImpl todoRepository = new TodoRepositoryImpl();
    todoRepository.data[0] = new Todo("Wake up");
    todoRepository.data[1] = new Todo("Take a bath");
    todoRepository.data[2] = new Todo("Take a meal");

    TodoService todoService = new TodoServiceImpl(todoRepository);
    todoService.showTodo();
  }

  public static void testAddTodo() {
    TodoRepository todoRepository = new TodoRepositoryImpl();
    TodoService todoService = new TodoServiceImpl(todoRepository);

    todoService.addTodo("Learn Java");
    todoService.addTodo("Work");
    todoService.addTodo("Fasting");

    todoService.showTodo();
  }

  public static void testRemoveTodo() {
    TodoRepository todoRepository = new TodoRepositoryImpl();
    TodoService todoService = new TodoServiceImpl(todoRepository);

    todoService.addTodo("Learn Java");
    todoService.addTodo("Work");
    todoService.addTodo("Fasting");
    todoService.addTodo("Workout");

    todoService.showTodo();
    todoService.removeTodo(1);
    todoService.showTodo();
    todoService.removeTodo(10);
    todoService.showTodo();

  }

}
