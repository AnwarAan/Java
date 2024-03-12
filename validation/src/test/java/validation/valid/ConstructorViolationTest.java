package validation.valid;

import java.lang.reflect.Constructor;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;

import jakarta.validation.ConstraintViolation;
import validation.validation.Adddress;
import validation.validation.Person;

public class ConstructorViolationTest extends AbstractValidatorTest {
  @Test
  void testConstrutor() throws NoSuchMethodException {
    String firstName = "";
    String lastName = "";
    Adddress address = new Adddress();

    Constructor<Person> constructor = Person.class.getConstructor(String.class, String.class, Adddress.class);

    Set<ConstraintViolation<Object>> violations = executableValidator.validateConstructorParameters(constructor,
        new Object[] { firstName, lastName, address });
    for (ConstraintViolation<Object> violation : violations) {
      System.out.println(violation.getPropertyPath());
      System.out.println(violation.getMessage());
      System.out.println("===================");
    }
  }

  @Test
  void testConstrutor2() throws NoSuchMethodException {
    String firstName = "";
    String lastName = "";
    Adddress address = new Adddress();

    Constructor<Person> constructor = Person.class.getConstructor(String.class, String.class, Adddress.class);

    Set<ConstraintViolation<Object>> violations = executableValidator.validateConstructorParameters(constructor,
        new Object[] { firstName, lastName, address });
    for (ConstraintViolation<Object> violation : violations) {
      System.out.println(violation.getPropertyPath());
      System.out.println(violation.getMessage());
      System.out.println("===================");
    }
  }
}
