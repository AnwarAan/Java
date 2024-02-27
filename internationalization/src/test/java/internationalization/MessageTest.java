package internationalization;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.jupiter.api.Test;

public class MessageTest {
  @Test
  void testMessage() {
    String pattern = "Hai {0}, Anda bisa mencari sesuatu dengan mengetik \"{1}\" di.";
    MessageFormat message = new MessageFormat(pattern);
    String format = message.format(new Object[] { "mca", "x" });
    System.out.println(format);
  }

  @Test
  void testMessage2() {
    Locale locale = new Locale("in", "ID");
    ResourceBundle resource = ResourceBundle.getBundle("message", locale);
    String pattern = resource.getString("welcome.message");

    MessageFormat message = new MessageFormat(pattern);
    String format = message.format(new Object[] { "mca", "jungle" });
    System.out.println(format);
  }

  @Test
  void testMessage3() {
    Locale locale = new Locale("in", "ID");
    ResourceBundle resource = ResourceBundle.getBundle("message", locale);
    String pattern = resource.getString("status");

    MessageFormat message = new MessageFormat(pattern);
    String format = message.format(new Object[] { "mca", new Date(), 1000000 });
    System.out.println(format);
  }

  @Test
  void testMessage4() {
    Locale locale = new Locale("en", "US");
    ResourceBundle resource = ResourceBundle.getBundle("message", locale);
    String pattern = resource.getString("status");

    MessageFormat message = new MessageFormat(pattern);
    String format = message.format(new Object[] { "mca", new Date(), 1000000 });
    System.out.println(format);
  }
}
