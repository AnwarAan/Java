package unit_test.service;

import java.util.UUID;

import unit_test.data.Person;
import unit_test.repository.PersonRepository;

public class PersonService {

  private PersonRepository personRepository;

  public PersonService(PersonRepository personRepository) {
    this.personRepository = personRepository;
  }

  public Person get(String id) {
    Person person = personRepository.selectById(id);

    if (person != null) {
      return person;
    } else {
      throw new IllegalArgumentException("Person not found");
    }
  }

  public Person register(String name) {
    var person = new Person(UUID.randomUUID().toString(), name);
    personRepository.insert(person);
    return person;

  }
}
