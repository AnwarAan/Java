package validation.valid;

import org.junit.jupiter.api.Test;

import validation.validation.Register;

public class LevelConstraintTest extends AbstractValidatorTest {
  @Test
  void testClassLevel() {

    Register register = new Register();
    register.setUsername("mca");
    register.setPassword("rahasia");
    register.setRetypePassword("rahasia123");

    validate(register);

  }
}
