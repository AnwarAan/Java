package reflection.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class ConstructorTest {
  @Test
  void testConstructor() {
    Class<Person> personClass = Person.class;

    for (Constructor constructor : personClass.getDeclaredConstructors()) {
      System.out.println(constructor.getName());
      for (Parameter parameter : constructor.getParameters()) {
        System.out.println(parameter.getName());
        System.out.println(parameter.getType());
        System.out.println(Arrays.toString(constructor.getTypeParameters()));
        System.out.println("============================");
      }
    }
  }

  @Test
  void testConstructor2()
      throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
    Class<Person> personClass = Person.class;

    Constructor<Person> constructorEmpty = personClass.getConstructor();
    Constructor<Person> constructorParameters = personClass.getConstructor(String.class, String.class);

    Person person1 = constructorEmpty.newInstance();
    Person person2 = constructorParameters.newInstance("mc", "anwar");

    System.out.println(person1);
    System.out.println(person2);
  }
}
