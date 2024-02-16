package unit_test;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

// @TestMethodOrder(MethodOrderer.MethodName.class)
// @TestMethodOrder(MethodOrderer.Random.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderTest {

  private int counter = 0;

  @Test
  @Order(1)
  void test3() {
    counter++;
    System.out.println(counter);

    // OrderTest test3 = new OrderTest();
    // test3.test3();

    // OrderTest test2 = new OrderTest();
    // test2.test2();

    // OrderTest test1 = new OrderTest();
    // test1.test1();

    // OrderTest test = new OrderTest();
    // test.test3();
    // test.test2();
    // test.test1();
  }

  @Test
  @Order(2)
  void test2() {
    counter++;
    System.out.println(counter);
  }

  @Test
  @Order(3)
  void test1() {
    counter++;
    System.out.println(counter);
  }
}
