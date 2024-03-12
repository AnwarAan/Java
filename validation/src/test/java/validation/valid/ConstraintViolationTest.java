package validation.valid;

import java.util.Set;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import validation.validation.Person;

public class ConstraintViolationTest {
  private ValidatorFactory validatorFactory;

  private Validator validator;

  @BeforeEach
  void setUp() {
    validatorFactory = Validation.buildDefaultValidatorFactory();
    validator = validatorFactory.getValidator();
  }

  @AfterEach
  void tearDown() {
    validatorFactory.close();
  }

  @Test
  void testValidationFailedNotBlank() {

    Person person = new Person();

    Set<ConstraintViolation<Person>> violations = validator.validate(person);
    Assertions.assertEquals(2, violations.size());

    for (ConstraintViolation<Person> violation : violations) {
      System.out.println("Message : " + violation.getMessage());
      System.out.println("Bean : " + violation.getLeafBean());
      System.out.println("Constraint : " + violation.getConstraintDescriptor().getAnnotation());
      System.out.println("Invalid Value : " + violation.getInvalidValue());
      System.out.println("Path : " + violation.getPropertyPath());
    }

  }

  @Test
  void testValidationFailedSize() {

    Person person = new Person();
    person.setFirstName("EKOEKOEKOEKOEKOEKOEKOEKOEKOEKOEKOEKOEKOEKOEKO");
    person.setLasttName("EKOEKOEKOEKOEKOEKOEKOEKOEKOEKOEKOEKOEKOEKOEKO");

    Set<ConstraintViolation<Person>> violations = validator.validate(person);
    Assertions.assertEquals(2, violations.size());

    for (ConstraintViolation<Person> violation : violations) {
      System.out.println("Message : " + violation.getMessage());
      System.out.println("Bean : " + violation.getLeafBean());
      System.out.println("Constraint : " + violation.getConstraintDescriptor().getAnnotation());
      System.out.println("Invalid Value : " + violation.getInvalidValue());
      System.out.println("Path : " + violation.getPropertyPath());
    }

  }

  @Test
  void testValidationSuccess() {

    Person person = new Person();
    person.setFirstName("Eko");
    person.setLasttName("Khannedy");

    Set<ConstraintViolation<Person>> violations = validator.validate(person);
    Assertions.assertEquals(0, violations.size());

  }
}
