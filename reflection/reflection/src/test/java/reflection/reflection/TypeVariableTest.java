package reflection.reflection;

import java.lang.reflect.TypeVariable;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class TypeVariableTest {
  @Test
  void testType() {
    Class<Data> datClass = Data.class;
    TypeVariable<Class<Data>>[] typeVariables = datClass.getTypeParameters();
    for (TypeVariable<Class<Data>> variable : typeVariables) {
      System.out.println(variable.getName());
      System.out.println(Arrays.toString(variable.getBounds()));

    }
  }

}
