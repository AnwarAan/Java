package todo3.repository;

import todo3.entity.Todolist;

public interface TodolistRepository {

  Todolist[] getAll();

  void add(Todolist todo);

  boolean remove(Integer number);
}
