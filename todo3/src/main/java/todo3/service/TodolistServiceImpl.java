package todo3.service;

import todo3.entity.Todolist;
import todo3.repository.TodolistRepository;

public class TodolistServiceImpl implements TodolistService {
  private TodolistRepository todolistRepository;

  public TodolistServiceImpl(TodolistRepository todolistRepository) {
    this.todolistRepository = todolistRepository;
  }

  @Override
  public void showTodo() {
    Todolist[] model = todolistRepository.getAll();

    System.out.println("TODOLIST");
    for (var todo : model) {
      System.out.println(todo.getId() + "." + todo.getTodo());
    }
  }

  @Override
  public void addTodo(String todo) {
    Todolist todolist = new Todolist(todo);
    todolistRepository.add(todolist);
    System.out.println("SUCCESS ADD TODO : " + todo);
  }

  @Override
  public void removeTodo(Integer number) {
    boolean success = todolistRepository.remove(number);
    if (success) {
      System.out.println("SUCCESS DELETE TODO  : " + number);
    } else {
      System.out.println("FAILED DELETE TODO  : " + number);

    }
  }

}
