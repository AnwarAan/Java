package reflection.reflection;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class ClassTest {
  @Test
  void testClass() throws ClassNotFoundException {
    Class<Person> person = Person.class;
    Class<?> person2 = Class.forName("java.reflection.Person");

    Person personClass = new Person("a", "b");
    // Class<? extends Person> person3 = person.getClass();
  }

  @Test
  void testClassMethod() {

    Class<Person> person = Person.class;
    System.out.println(person.getSuperclass());
    System.out.println(Arrays.toString(person.getInterfaces()));
    System.out.println(Arrays.toString(person.getDeclaredConstructors()));
    System.out.println(Arrays.toString(person.getDeclaredMethods()));
    System.out.println(Arrays.toString(person.getDeclaredFields()));
    System.out.println(person.getModifiers());
    System.out.println(person.getPackage());
    System.out.println(person.getName());
    System.out.println(person.getSimpleName());
  }
}
