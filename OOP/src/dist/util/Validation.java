package dist.util;

import java.lang.reflect.Field;

import dist.annotation.NotBlank;
import dist.data.Login;
import dist.error.BlankException;

public class Validation {

  public static void validation(Login login) throws Exception, NullPointerException {
    if (login.name() == null) {
      throw new NullPointerException("user cant null");
    } else if (login.name().isBlank()) {
      throw new Exception("uset cant blank");
    } else if (login.password() == null) {
      throw new NullPointerException("password cant null");
    } else if (login.password().isBlank()) {
      throw new Exception("password cant blank");
    }
  }

  public static void validationReflection(Object object) {
    Class aclass = object.getClass();
    Field[] fields = aclass.getDeclaredFields();

    for (Field field : fields) {
      field.setAccessible(true);
      if (field.getAnnotation(NotBlank.class) != null) {

        try {
          String value = (String) field.get(object);
          if (value == null || value.isBlank()) {
            throw new BlankException("FIELD " + field.getName() + " IS BLANK");
          }
        } catch (IllegalAccessException e) {
          System.out.println("Cant Access " + field.getName());
        }
      }
    }
  }
}
