package reflection.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

public class MethodTest {
  @Test
  void testMethod() {
    Class<Person> person = Person.class;

    Method[] methods = person.getDeclaredMethods();
    for (Method method : methods) {
      System.out.println(method.getName());
      System.out.println(method.getReturnType());
      System.out.println(method.getParameterTypes());
      System.out.println(method.getExceptionTypes());
      System.out.println("============================");
    }
  }

  @Test
  void testMethod2() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
    Class<Person> person = Person.class;
    Method getFirstName = person.getDeclaredMethod("getFirstName");

    Person person2 = new Person("mc", "anwar");
    String firstName = (String) getFirstName.invoke(person2);
    System.out.println(firstName);
  }
}
