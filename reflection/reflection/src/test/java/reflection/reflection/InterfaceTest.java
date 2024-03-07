package reflection.reflection;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class InterfaceTest {
  @Test
  void testInterface() {
    Class<Nameable> nameClass = Nameable.class;

    System.out.println(nameClass.getName());
    System.out.println(nameClass.isInterface());
    System.out.println(nameClass.getSuperclass());
    System.out.println(nameClass.getInterfaces());
    System.out.println(nameClass.getDeclaredFields());
    System.out.println(nameClass.getDeclaredMethods());
    System.out.println(nameClass.getDeclaredConstructors());
  }

  @Test
  void testInterface2() {
    Class<Person> personClass = Person.class;

    System.out.println(Arrays.toString(personClass.getInterfaces()));
  }
}
