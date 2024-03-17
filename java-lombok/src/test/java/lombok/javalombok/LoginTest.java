package lombok.javalombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest {
  @Test
  void testCreate() {

    var login1 = Login.createEmpty();

    Assertions.assertNull(login1.getUsername());
    Assertions.assertNull(login1.getPassword());

    var login2 = Login.create("mca", "rahasia");

    Assertions.assertEquals("mca", login2.getUsername());
    Assertions.assertEquals("rahasia", login2.getPassword());

  }

  @Test
  void testToString() {

    var login = Login.create("mca", "rahasia");
    System.out.println(login);

  }
}
