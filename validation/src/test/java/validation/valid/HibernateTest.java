package validation.valid;

import org.junit.jupiter.api.Test;

import validation.validation.Payment;

public class HibernateTest extends AbstractValidatorTest {
  @Test
  void testHibernate() {
    Payment payment = new Payment();
    payment.setAmount(1000L);
    payment.setOrderId("0001");
    payment.setCreditCard("434");
    validate(payment);
  }

  @Test
  void testHibernate2() {
    Payment payment = new Payment();
    payment.setAmount(10000000L);
    payment.setOrderId("0001");
    payment.setCreditCard("4111111111111111");
    validate(payment);
  }

}
