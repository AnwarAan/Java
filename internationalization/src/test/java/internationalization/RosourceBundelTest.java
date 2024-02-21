package internationalization;

import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Resources;

public class RosourceBundelTest {
  @Test
  void testResourceBundle() {
    var indonesia = new Locale("id", "ID");
    var resourceBUndle = ResourceBundle.getBundle("message", indonesia);
    System.out.println(resourceBUndle.getString("hello"));
    System.out.println(resourceBUndle.getString("goodbye"));
  }

  @Test
  void testResourceBundleNotFound() {
    var indonesia = new Locale("en", "US");
    var resourceBUndle = ResourceBundle.getBundle("message", indonesia);
    System.out.println(resourceBUndle.getString("hello"));
    System.out.println(resourceBUndle.getString("goodbye"));
  }
}
