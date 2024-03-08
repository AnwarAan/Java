package reflection.reflection;

import java.lang.reflect.Modifier;

import org.junit.jupiter.api.Test;

public class ModifierTest {
  @Test
  void testModifier() {
    Class<Person> personClass = Person.class;

    System.out.println(Modifier.isPublic(personClass.getModifiers()));
    System.out.println(Modifier.isFinal(personClass.getModifiers()));
    System.out.println(Modifier.isStatic(personClass.getModifiers()));
  }
}
