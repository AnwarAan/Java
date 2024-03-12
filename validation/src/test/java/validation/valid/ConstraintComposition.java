package validation.valid;

import org.junit.jupiter.api.Test;

import validation.gorup.CreditCardGroup;
import validation.validation.Payment;

public class ConstraintComposition extends AbstractValidatorTest {
  @Test
  void testComposition() {

    Payment payment = new Payment();
    payment.setOrderId("29852309850238529589akjkjdsak");

    validateWithGroup(payment, CreditCardGroup.class);
  }
}
