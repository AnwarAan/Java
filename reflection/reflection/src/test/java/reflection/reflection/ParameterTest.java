package reflection.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import org.junit.jupiter.api.Test;

public class ParameterTest {
  @Test
  void testParams() {
    Class<Person> person = Person.class;

    for (Method method : person.getDeclaredMethods()) {
      Parameter[] parameters = method.getParameters();
      System.out.println(method.getName());
      for (Parameter parameter : parameters) {
        System.out.println("Params Name : " + parameter.getName());
        System.out.println("Params Type : " + parameter.getType());
      }
      System.out.println("=========================");
    }
  }

  @Test
  void testParams2() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
    Class<Person> person = Person.class;
    Method setFirstName = person.getDeclaredMethod("setFirstName", String.class);

    Person person2 = new Person("MC", "Anwar");
    setFirstName.invoke(person2, "mca");

    System.out.println(person2.getFirstName());
  }
}
