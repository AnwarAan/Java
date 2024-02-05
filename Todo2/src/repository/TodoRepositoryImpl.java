package repository;

import entity.Todo;

public class TodoRepositoryImpl implements TodoRepository {

  private Todo[] data = new Todo[10];

  @Override
  public Todo[] getAll() {
    return data;
  }

  @Override
  public void addTodo(Todo todo) {
    // TODO Auto-generated method stub

  }

  @Override
  public void removeTodo(Integer number) {
    // TODO Auto-generated method stub

  }
}
