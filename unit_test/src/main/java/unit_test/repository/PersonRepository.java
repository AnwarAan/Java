package unit_test.repository;

import unit_test.data.Person;

public interface PersonRepository {
  Person selectById(String id);

  void insert(Person person);
}
