package validation.valid;

import java.util.Set;

import org.junit.jupiter.api.Test;

import jakarta.validation.ConstraintViolation;
import validation.gorup.CreditCardGroup;
import validation.payload.EmailErrorPayload;
import validation.validation.Payment;

public class PayloadTest extends AbstractValidatorTest {
  @Test
  void testPayload() {
    Payment payment = new Payment();
    payment.setCreditCard("wrong");

    Set<ConstraintViolation<Payment>> violations = validator.validate(payment, CreditCardGroup.class);
    for (ConstraintViolation<Payment> violation : violations) {
      violation.getConstraintDescriptor().getPayload().forEach(aClas -> {
        if (aClas == EmailErrorPayload.class) {
          EmailErrorPayload emailErrorPayload = new EmailErrorPayload();
          emailErrorPayload.sendEmail(violation);
        }
      });
    }
  }
}
