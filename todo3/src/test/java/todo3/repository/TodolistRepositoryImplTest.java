package todo3.repository;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.zaxxer.hikari.HikariDataSource;

import todo3.entity.Todolist;
import todo3.util.DatabaseUtil;

public class TodolistRepositoryImplTest {

  private HikariDataSource dataSource;
  private TodolistRepository todolistRepository;

  @BeforeEach
  void setup() {
    dataSource = DatabaseUtil.getDataSource();
    todolistRepository = new TodolistRepositoryImpl(dataSource);
  }

  @Test
  void addTodo() {

    Todolist todolist = new Todolist();
    todolist.setTodo("Bubur Im");
    todolistRepository.add(todolist);
  }

  @Test
  void testRemove() {
    System.out.println(todolistRepository.remove(1));
    System.out.println(todolistRepository.remove(2));
    System.out.println(todolistRepository.remove(3));
    System.out.println(todolistRepository.remove(4));
  }

  @Test
  void testGetAll() {
    todolistRepository.add(new Todolist("EKo"));
    todolistRepository.add(new Todolist("Kurniawan"));
    todolistRepository.add(new Todolist("Khannedy"));

    Todolist[] todolists = todolistRepository.getAll();
    for (var todo : todolists) {
      System.out.println(todo.getId() + " : " + todo.getTodo());
    }
  }

  @AfterEach
  void tearDown() {
    dataSource.close();
  }
}
