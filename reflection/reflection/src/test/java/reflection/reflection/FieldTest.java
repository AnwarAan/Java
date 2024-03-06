package reflection.reflection;

import java.lang.reflect.Field;

import org.junit.jupiter.api.Test;

public class FieldTest {
  @Test
  void testField() {
    Class<Person> person = Person.class;
    Field[] fields = person.getDeclaredFields();

    for (Field field : fields) {
      System.out.println(field.getName() + " : " + field.getType().getName());
    }
  }

  @Test
  void testField2() throws NoSuchFieldException, IllegalAccessException {
    Class<Person> person = Person.class;
    Field firstName = person.getDeclaredField("firsName");
    firstName.setAccessible(true);

    Person person2 = new Person("mc", "anwar");
    String result = (String) firstName.get(person2);
    System.out.println(result);

    Person person3 = new Person("mc", "anwar");
    String result2 = (String) firstName.get(person3);
    System.out.println(result2);
  }

  @Test
  void testField3() throws NoSuchFieldException, IllegalAccessException {
    Class<Person> person = Person.class;
    Field firstName = person.getDeclaredField("firsName");
    firstName.setAccessible(true);

    Person person2 = new Person("mc", "anwar");
    firstName.set(person2, "mca");
    System.out.println(person2.getFirsName());

    Person person3 = new Person("mc", "anwar");
    firstName.set(person3, "anwar");
    System.out.println(person2.getFirsName());

  }
}
