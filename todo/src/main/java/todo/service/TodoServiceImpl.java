package todo.service;

import repository.TodoRepository;
import entity.Todo;

public class TodoServiceImpl implements TodoService {

  private TodoRepository todoRepository;

  public TodoServiceImpl(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @Override
  public void showTodo() {
    System.out.println("TODO LIST");
    Todo[] model = todoRepository.getAll();
    for (var i = 0; i < model.length; i++) {
      var todo = model[i];
      var no = i + 1;

      if (todo != null) {
        System.out.println(no + ". " + todo.getTodo());
      }
    }
  }

  @Override
  public void addTodo(String todo) {
    Todo todolist = new Todo(todo);
    todoRepository.addTodo(todolist);
    System.out.println("Success Add Todo : " + todo);
  }

  @Override
  public void removeTodo(Integer number) {
    boolean success = todoRepository.removeTodo(number);
    if (success) {
      System.out.println("Success Delete Todo");
    } else {
      System.out.println("Failed Delete Todo");
    }

  }

}
