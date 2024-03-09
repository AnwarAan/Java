package reflection.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.RecordComponent;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class RecordTest {
  @Test
  void testRecord() {
    Class<Product> productClass = Product.class;

    System.out.println(productClass.isRecord());
    System.out.println(Arrays.toString(productClass.getFields()));
    System.out.println(Arrays.toString(productClass.getMethods()));
    System.out.println(Arrays.toString(productClass.getDeclaredConstructors()));
    System.out.println(Arrays.toString(productClass.getRecordComponents()));
  }

  @Test
  void testRecord2() throws IllegalAccessException, InvocationTargetException {
    Product product = new Product("1", "iPhone", 70000000L);
    Class<Product> productClass = Product.class;
    RecordComponent component = Arrays.stream(productClass.getRecordComponents())
        .filter(recordComponent -> recordComponent.getName().equals("id")).findFirst().get();
    Method method = component.getAccessor();
    System.out.println(method.invoke(product));
  }

  @Test
  void testRecord3() throws IllegalAccessException, InvocationTargetException {
    Class<Product> productClass = Product.class;
    RecordComponent[] components = Product.class.getRecordComponents();

    Product product = new Product("1", "iPhone", 70000000L);

    for (RecordComponent component : components) {
      Method accesor = component.getAccessor();
      System.out.println(accesor.getName());
      System.out.println(accesor.invoke(product));
    }

  }
}
