package validation.valid;

import org.junit.jupiter.api.Test;

import validation.gorup.CreditCardGroup;
import validation.gorup.VirtualAccountGroup;
import validation.validation.Payment;

public class GroupingContraintTest extends AbstractValidatorTest {
  @Test
  void testGroupingContraint() {
    Payment payment = new Payment();
    payment.setAmount(1000L);
    payment.setOrderId("0001");
    payment.setCreditCard("434");
    validateWithGroup(payment, CreditCardGroup.class);
  }

  @Test
  void testGroupingContraint2() {
    Payment payment = new Payment();
    payment.setAmount(10000000L);
    payment.setOrderId("0001");
    payment.setCreditCard("4111111111111111");
    validateWithGroup(payment, CreditCardGroup.class);
  }

  @Test
  void testGroupingContraint3() {
    Payment payment = new Payment();
    payment.setAmount(10000000L);
    payment.setOrderId("0001");
    payment.setCreditCard("4111111111111111");
    payment.setVirtualAccount("798126498");
    validateWithGroup(payment, VirtualAccountGroup.class);
  }
}
