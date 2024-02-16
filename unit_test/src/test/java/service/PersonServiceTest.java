package service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.junit.jupiter.MockitoExtension;

import unit_test.data.Person;
import unit_test.repository.PersonRepository;
import unit_test.service.PersonService;

@Extensions({ @ExtendWith(MockitoExtension.class) })

public class PersonServiceTest {

  @Mock
  private PersonRepository personRepository;
  private PersonService personService;

  @BeforeEach
  void setUp() {
    personService = new PersonService(personRepository);
  }

  @Test
  void notFound() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> personService.get("not found"));
  }

  @Test
  void getSuccess() {
    Mockito.when(personRepository.selectById("1")).thenReturn(new Person("1", "MCA"));
    var person = personService.get("not found");
    Assertions.assertNotNull(person);
    Assertions.assertEquals("1", person.getId());
    Assertions.assertEquals("MCA", person.getName());
  }

  @Test
  void registerSuccess() {
    var person = personService.register("mcnwr76");
    Assertions.assertNotNull(person);
    Assertions.assertEquals("1", person.getId());
    Assertions.assertNotNull(person.getId());

    Mockito.verify(personRepository, Mockito.times(1)).insert(new Person(person.getId(), "1"));
  }
}
