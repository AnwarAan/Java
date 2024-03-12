package validation.valid;

import org.junit.jupiter.api.Test;

import validation.gorup.CreditCardGroup;
import validation.gorup.PaymentGroup;
import validation.validation.Customer;
import validation.validation.Payment;

public class GroupConvertTest extends AbstractValidatorTest {
  @Test
  void testHibernate() {
    Payment payment = new Payment();
    payment.setAmount(1000L);
    payment.setOrderId("0001");
    payment.setCreditCard("434");
    payment.setCustomer(new Customer());
    validateWithGroup(payment, CreditCardGroup.class);
  }
}
