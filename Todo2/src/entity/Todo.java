package entity;

public class Todo {
  private String todo;

  public Todo() {
  }

  public Todo(String todo) {
    this.todo = todo;
  }

  public String getTodo() {
    return this.todo;
  }

  public void setTodo(String todo) {
    this.todo = todo;
  }
}
