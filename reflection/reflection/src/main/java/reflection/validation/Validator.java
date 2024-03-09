package reflection.validation;

import java.lang.reflect.Field;

import javax.management.RuntimeErrorException;

import reflection.annotation.NotBlank;

public class Validator {
  public static void validateNotBlank(Object object) throws IllegalAccessException {
    Class<?> class1 = object.getClass();
    Field[] fields = class1.getDeclaredFields();

    for (Field field : fields) {
      NotBlank notBlank = field.getAnnotation(NotBlank.class);
      if (notBlank != null) {
        field.setAccessible(true);
        String value = (String) field.get(object);
        if (notBlank.allowEmptyString()) {
        } else {
          value = value.trim();
        }

        if ("".equals(value)) {
          throw new RuntimeException(field.getName() + "Not blank");
        }
      }
    }

  }
}
