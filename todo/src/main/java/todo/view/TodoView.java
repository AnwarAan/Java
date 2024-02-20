package view;

import entity.Todo;
import service.TodoService;
import util.InputUtil;

public class TodoView {

  private TodoService todoService;

  public TodoView(TodoService todoService) {
    this.todoService = todoService;
  }

  public void showTodo() {
    while (true) {
      todoService.showTodo();

      System.out.println("MENU : ");
      System.out.println("1. Tambah");
      System.out.println("2. Hapus");
      System.out.println("x. Keluar");

      var input = InputUtil.input("choose");

      if (input.equals("1")) {
        addTodo();
      } else if (input.equals("2")) {
        removeTodo();
      } else if (input.equals("x")) {
        break;
      } else {
        System.out.println("Wrong Input");
      }
    }
  }

  public void addTodo() {
    System.out.println("ADD TODO HERE");

    var todo = InputUtil.input("Todo (x => exit)");

    if (todo.equals("x")) {

    } else {
      todoService.addTodo(todo);
    }
  }

  public void removeTodo() {
    System.out.println("REMOVE TODO HERE");

    var number = InputUtil.input("Todo (x => exit)");

    if (number.equals("x")) {

    } else {
      todoService.removeTodo(Integer.valueOf(number));
    }
  }
}
