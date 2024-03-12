package validation.valid;

import org.junit.jupiter.api.Test;

import validation.gorup.PaymentGroup;
import validation.validation.Payment;

public class GroupSequence extends AbstractValidatorTest {
  @Test
  void testSequence() {
    Payment payment = new Payment();
    payment.setAmount(10000000L);
    payment.setOrderId("0001");
    payment.setCreditCard("4111111111111111");
    payment.setVirtualAccount("798126498");
    validateWithGroup(payment, PaymentGroup.class);
  }
}
