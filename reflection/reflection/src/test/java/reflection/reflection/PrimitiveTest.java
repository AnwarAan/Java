package reflection.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

public class PrimitiveTest {
  @Test
  void testPrimitive() {
    Class<Integer> integerClass = int.class;
    Class<Long> longClass = long.class;
    Class<Boolean> booleanClass = boolean.class;

    System.out.println(integerClass.isPrimitive());
    System.out.println(longClass.isPrimitive());
    System.out.println(booleanClass.isPrimitive());
  }

  @Test
  void testPrimitive2() throws NoSuchFieldException {
    Class<Person> personClass = Person.class;
    Field age = personClass.getDeclaredField("age");

    System.out.println(age.getType().isPrimitive());
  }

  @Test
  void testPrimitive3() throws NoSuchFieldException, IllegalAccessException {
    Class<Person> personClass = Person.class;
    Field age = personClass.getDeclaredField("age");

    System.out.println(age.getType().isPrimitive());
    age.setAccessible(true);

    Person person = new Person("mc", "anwar");
    person.setAge(25);

    System.out.println(age.getInt(person));
  }

  @Test
  void testPrimitive4()
      throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
    Class<Person> personClass = Person.class;
    Method setAge = personClass.getDeclaredMethod("setAge", int.class);

    Person person = new Person();
    setAge.invoke(person, 25);

    System.out.println(person);
  }
}
