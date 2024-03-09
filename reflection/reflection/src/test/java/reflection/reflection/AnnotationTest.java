package reflection.reflection;

import org.junit.jupiter.api.Test;

import reflection.validation.Validator;

public class AnnotationTest {
  @Test
  void testAnnotation() throws IllegalAccessException {
    Person person = new Person("mc", "anwar");
    Validator.validateNotBlank(person);
  }
}
