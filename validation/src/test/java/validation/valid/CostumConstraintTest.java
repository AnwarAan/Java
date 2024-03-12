package validation.valid;

import org.junit.jupiter.api.Test;

import validation.gorup.CreditCardGroup;
import validation.validation.Payment;

public class CostumConstraintTest extends AbstractValidatorTest {
  @Test
  void testCustomConstraint() {

    Payment payment = new Payment();
    payment.setOrderId("mca");

    validateWithGroup(payment, CreditCardGroup.class);

  }
}
