package validation.payload;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Payload;

public class EmailErrorPayload implements Payload {
  public void sendEmail(ConstraintViolation<?> violation) {
    System.out.println("Send email beacause Error " + violation.getMessage());
  }
}
