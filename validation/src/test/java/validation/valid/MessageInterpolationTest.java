package validation.valid;

import org.junit.jupiter.api.Test;

import validation.gorup.PaymentGroup;
import validation.gorup.VirtualAccountGroup;
import validation.validation.Payment;

public class MessageInterpolationTest extends AbstractValidatorTest {

  @Test
  void testMessage() {

    Payment payment = new Payment();
    payment.setOrderId("10238138193810312938");
    payment.setVirtualAccount("312313");
    payment.setAmount(10L);

    validateWithGroup(payment, VirtualAccountGroup.class);

  }
}
