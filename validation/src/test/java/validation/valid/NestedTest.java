package validation.valid;

import java.util.Set;
import validation.validation.Adddress;
import validation.validation.Person;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;

public class NestedTest {
  private Validator validator;

  @BeforeEach
  void setup() {
    validator = Validation.buildDefaultValidatorFactory().getValidator();
  }

  @Test
  void testNested() {

    Person person = new Person();
    person.setFirstName("mc");
    person.setLasttName("anwar");

    Adddress adddress = new Adddress();
    person.setAddress(adddress);

    Set<ConstraintViolation<Person>> violations = validator.validate(person);
    for (ConstraintViolation<Person> violation : violations) {
      System.out.println(violation.getMessage());
      System.out.println(violation.getPropertyPath());
      System.out.println("+=====================+");
    }
  }
}
