package dist.application;

import dist.data.User;
import dist.util.Validation;

public class ReflctionApp {
  public static void main(String[] args) {

    User user = new User();
    user.setUsername("null");
    user.setPassword("null");
    user.setName(null);
    Validation.validationReflection(user);
  }
}
