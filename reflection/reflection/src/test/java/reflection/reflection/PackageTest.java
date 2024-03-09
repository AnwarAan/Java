package reflection.reflection;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class PackageTest {
  @Test
  void testPackage() {
    Class<Person> personClass = Person.class;
    Package package1 = personClass.getPackage();

    System.out.println(package1.getName());
    System.out.println(Arrays.toString(package1.getAnnotations()));
    ;
  }
}
