package dist.util;

import dist.data.Login;
import dist.error.BlankException;

public class ValidateRuntime {
  public static void validateRuntime(Login login) {
    if (login.name() == null) {
      throw new BlankException("user cant null");
    } else if (login.name().isBlank()) {
      throw new NullPointerException("user cant blank");
    } else if (login.password() == null) {
      throw new BlankException("user cant null");
    } else if (login.name().isBlank()) {
      throw new NullPointerException("user cant blank");
    }
  }

}
