package validation.constraint;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CheckPasswordParameterValidator implements ConstraintValidator<CheckPasswordParameter, Object[]> {
  private int passwordParam;

  private int retypePasswordParam;

  @Override
  public void initialize(CheckPasswordParameter constraintAnnotation) {
    passwordParam = constraintAnnotation.passwordParam();
    retypePasswordParam = constraintAnnotation.retypePasswordParam();
  }

  @Override
  public boolean isValid(Object[] value, ConstraintValidatorContext context) {
    String password = (String) value[passwordParam];
    String retypePassword = (String) value[retypePasswordParam];

    if (password == null || retypePassword == null) {
      return true; // skip validation
    }

    return password.equals(retypePassword);
  }
}
