package validation.valid;

import java.util.Set;
import validation.validation.Person;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

public class ConstraintTest {
  private ValidatorFactory validatorFactory;

  private Validator validator;

  @BeforeEach
  void setup() {
    validatorFactory = Validation.buildDefaultValidatorFactory();
    validator = validatorFactory.getValidator();
  }

  @AfterEach
  void tearDown() {
    validatorFactory.close();
  }

  @Test
  void testContraint() {
    ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
    Validator validator = validatorFactory.getValidator();

    Person person = new Person();
    Set<ConstraintViolation<Person>> constraintViolations = validator.validate(person);

    for (ConstraintViolation<Person> constraintViolation : constraintViolations) {
      System.out.println(constraintViolation.getMessage());
    }

    validatorFactory.close();
  }

  @Test
  void testContraint2() {

    Person person = new Person();
    Set<ConstraintViolation<Person>> violations = validator.validate(person);

    person.setFirstName("llllllllllllllll");
    person.setLasttName("llllllllllllllll");

    Assertions.assertEquals(2, violations.size());
    for (ConstraintViolation<Person> constraintViolation : violations) {
      System.out.println("Message" + constraintViolation.getMessage());
      System.out.println("Bean" + constraintViolation.getLeafBean());
      System.out.println("Annotation" + constraintViolation.getConstraintDescriptor().getAnnotation());
      System.out.println("Annotation" + constraintViolation.getInvalidValue());
      System.out.println("Annotation" + constraintViolation.getPropertyPath());

    }
  }
}
