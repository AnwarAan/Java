package reflection.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class ParameterType {
  @Test
  void testParams() throws NoSuchMethodException {
    Class<Person> personClass = Person.class;
    Method getHobbies = personClass.getDeclaredMethod("getHobbies");

    Type returnType = getHobbies.getGenericReturnType();
    if (returnType instanceof ParameterizedType) {
      ParameterizedType parameterizedType = (ParameterizedType) returnType;
      System.out.println(parameterizedType.getRawType());
      System.out.println(Arrays.toString(parameterizedType.getActualTypeArguments()));
    }
  }

  @Test
  void testParams2() throws NoSuchMethodException {
    Class<Person> personClass = Person.class;
    Method getHobbies = personClass.getDeclaredMethod("getHobbies");

    Type returnType = getHobbies.getGenericReturnType();
    if (returnType instanceof ParameterizedType) {
      ParameterizedType parameterizedType = (ParameterizedType) returnType;
      System.out.println(parameterizedType.getRawType());
      System.out.println(Arrays.toString(parameterizedType.getActualTypeArguments()));
    }
  }
}
