package validation.valid;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;

import validation.validation.Adddress;
import validation.validation.Person;

public class ContainerDataTest extends AbstractValidatorTest {

  @Test
  void testContainerData() {

    Person person = new Person();
    person.setFirstName("Eko");
    person.setLasttName("Eko");
    person.setAddress(new Adddress());
    person.getAddress().setCity("Subang");
    person.getAddress().setCountry("Indonesia");
    person.getAddress().setStreet("Bla bla bla");

    person.setHobbies(new ArrayList<>());
    person.getHobbies().add("");
    person.getHobbies().add("   ");
    person.getHobbies().add("Gaming");

    validate(person);

  }
}
