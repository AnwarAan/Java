package reflection.reflection;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class ArrayTest {
  @Test
  void testArray() {

    Class<String[]> stringClass = String[].class;
    Class<int[]> intcClass = int[].class;

    System.out.println(stringClass.isArray());
    System.out.println(intcClass.isArray());
  }

  @Test
  void testArray2() {

    Class<String[]> stringClass = String[].class;

    System.out.println(Arrays.toString(stringClass.getDeclaredFields()));
    System.out.println(Arrays.toString(stringClass.getDeclaredMethods()));
    System.out.println(Arrays.toString(stringClass.getDeclaredConstructors()));
    System.out.println(stringClass.getComponentType());
  }

  @Test
  void testArray3() {

    Class<String[]> stringClass = String[].class;
    String[] array = (String[]) Array.newInstance(stringClass.getComponentType(), 10);

    System.out.println(Arrays.toString(array));

    Array.set(array, 0, "a1");
    Array.set(array, 1, "a2");

    System.out.println(Arrays.toString(array));
    System.out.println(Array.get(array, 0));
    System.out.println(Array.get(array, 1));
  }
}
