package reflection.reflection;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class EnumTest {
  @Test
  void testEnum() {
    Class<Gender> genderClass = Gender.class;

    System.out.println(genderClass.getName());
    System.out.println(genderClass.getSuperclass());
    System.out.println(Arrays.toString(genderClass.getEnumConstants()));
    System.out.println(genderClass.isEnum());
    System.out.println(Arrays.toString(genderClass.getDeclaredFields()));
    System.out.println(Arrays.toString(genderClass.getDeclaredConstructors()));
    System.out.println(Arrays.toString(genderClass.getDeclaredMethods()));

  }
}
