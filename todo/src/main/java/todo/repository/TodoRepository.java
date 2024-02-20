package repository;

import entity.Todo;

public interface TodoRepository {
  Todo[] getAll();

  void addTodo(Todo todo);

  boolean removeTodo(Integer number);

}
