package lombok.javalombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomerTest {
  @Test
  void test() {
    Customer customer = new Customer();
    customer.setId("1");
    customer.setName("mca");

    System.out.println(customer.getId());
    System.out.println(customer.getName());
  }

  @Test
  void testCustomerConstructor() {

    var customer = new Customer("ID", "NAME");
    Assertions.assertEquals("ID", customer.getId());
    Assertions.assertEquals("NAME", customer.getName());

  }

  @Test
  void testEquals() {

    var customer1 = new Customer("ID", "NAME 1");
    var customer2 = new Customer("ID", "NAME 2");

    Assertions.assertEquals(customer1, customer2);
    Assertions.assertEquals(customer1.hashCode(), customer2.hashCode());

  }
}
