package validation.valid;

import java.lang.reflect.Method;
import java.util.Set;

import org.junit.jupiter.api.Test;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.executable.ExecutableValidator;
import validation.validation.Person;

public class MethodValidationTest extends AbstractValidatorTest {
  @Test
  void testMethod() throws NoSuchMethodException {
    ExecutableValidator executableValidator = validator.forExecutables();

    Person person = new Person();
    String name = "mca";
    Method method = Person.class.getMethod("sayHello", String.class);

    Set<ConstraintViolation<Person>> violations = executableValidator.validateReturnValue(person, method,
        new Object[] { name });
    for (ConstraintViolation<Person> violation : violations) {
      System.out.println(violation.getPropertyPath());
      System.out.println(violation.getMessage());
      System.out.println("====================");
    }
  }

  @Test
  void testSayHello() throws NoSuchMethodException {

    Person person = new Person();
    String name = "";

    Method method = Person.class.getMethod("sayHello", String.class);

    Set<ConstraintViolation<Person>> violations = executableValidator
        .validateParameters(person, method, new Object[] { name });
    for (ConstraintViolation<Person> violation : violations) {
      System.out.println(violation.getPropertyPath());
      System.out.println(violation.getMessage());
      System.out.println("===========");
    }

  }

  @Test
  void testMethod2() throws NoSuchMethodException {
    ExecutableValidator executableValidator = validator.forExecutables();

    Person person = new Person();
    person.setFirstName("mc");
    person.setLasttName("anwar");
    String value = person.fullName();

    Method method = Person.class.getMethod("fullName");

    Set<ConstraintViolation<Person>> violations = executableValidator.validateReturnValue(person, method, value);
    for (ConstraintViolation<Person> violation : violations) {
      System.out.println(violation.getPropertyPath());
      System.out.println(violation.getMessage());
      System.out.println("====================");
    }
  }
}
