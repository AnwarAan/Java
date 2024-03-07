package reflection.reflection;

import org.junit.jupiter.api.Test;

public class SuperClassTest {
  @Test
  void testSuper() {
    Class<Person> personClass = Person.class;
    System.out.println(personClass);

    Class<? super Person> superClass = personClass.getSuperclass();
    System.out.println(superClass);

    Class<? super Person> superClassTop = personClass.getSuperclass();
    System.out.println(superClassTop);
  }
}
