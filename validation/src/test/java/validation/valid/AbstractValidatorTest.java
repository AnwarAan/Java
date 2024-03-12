package validation.valid;

import java.util.Set;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.MessageInterpolator;
import jakarta.validation.Valid;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import jakarta.validation.executable.ExecutableValidator;
import validation.extrator.DataValueExtrator;
import validation.extrator.DataIntegerValueExtrator;
import validation.extrator.EntryValueExtratorValue;
import validation.extrator.EntryValueExtratorKey;

public class AbstractValidatorTest {
  protected ValidatorFactory validatorFactory;
  protected Validator validator;
  protected ExecutableValidator executableValidator;
  protected MessageInterpolator messageInterpolator;

  @BeforeEach
  void setup() {

    validatorFactory = Validation.byDefaultProvider().configure()
        .addValueExtractor(new DataValueExtrator())
        .addValueExtractor(new EntryValueExtratorKey())
        .addValueExtractor(new EntryValueExtratorValue())
        .addValueExtractor(new DataIntegerValueExtrator())
        .buildValidatorFactory();
    validator = validatorFactory.getValidator();
    executableValidator = validator.forExecutables();
    messageInterpolator = validatorFactory.getMessageInterpolator();
  }

  @AfterEach
  void tearDown() {
    validatorFactory.close();
  }

  void validate(Object o) {
    Set<ConstraintViolation<Object>> violations = validator.validate(o);
    for (ConstraintViolation<Object> violation : violations) {
      System.out.println(violation.getPropertyPath());
      System.out.println(violation.getMessage());
      System.out.println("======================");
    }
  }

  void validateWithGroup(Object o, Class<?>... groups) {
    Set<ConstraintViolation<Object>> violations = validator.validate(o, groups);
    for (ConstraintViolation<Object> violation : violations) {
      System.out.println(violation.getPropertyPath());
      System.out.println(violation.getMessage());
      System.out.println("======================");
    }
  }

  void validateWithException(Object o) {
    Set<ConstraintViolation<Object>> violations = validator.validate(o);
    if (!violations.isEmpty()) {
      throw new ConstraintViolationException(violations);
    }
  }
}
