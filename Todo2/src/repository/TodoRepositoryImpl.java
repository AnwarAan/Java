package repository;

import entity.Todo;

public class TodoRepositoryImpl implements TodoRepository {

  public Todo[] data = new Todo[10];
  // private Todo[] data = new Todo[10];

  public boolean isFull() {
    var full = true;
    for (var i = 0; i < data.length; i++) {
      if (data[i] == null) {
        full = false;
        break;
      }
    }
    return full;
  }

  public void resizeIsFull() {
    if (isFull()) {

      var temp = data;
      data = new Todo[data.length * 2];
      for (var i = 0; i < temp.length; i++) {
        data[i] = temp[i];
      }
    }
  }

  @Override
  public Todo[] getAll() {
    return data;
  }

  @Override
  public void addTodo(Todo todo) {
    resizeIsFull();

    for (var i = 0; i < data.length; i++) {
      if (data[i] == null) {
        data[i] = todo;
        break;
      }
    }
  }

  @Override
  public boolean removeTodo(Integer number) {

    if ((number - 1) >= data.length) {
      return false;
    } else if (data[number - 1] == null) {
      return false;
    } else {
      for (var i = (number - 1); i < data.length; i++) {
        if (i == (data.length - 1)) {
          data[i] = null;
        } else {
          data[i] = data[i + 1];
        }
      }
      return true;
    }
  }
}
