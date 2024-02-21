package internationalization;

import java.text.ChoiceFormat;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.jupiter.api.Test;

public class ChoiceTest {
  @Test
  void testChoice() {
    String pattern = "-1#negative | 0#kosong | 1#satu 1<banyak";
    try {
      var choice = new ChoiceFormat(pattern);
      System.out.println(choice.format(0));
    } catch (IllegalArgumentException e) {
      System.out.println("This : " + e.getMessage());
    }
  }

  @Test
  void testChoice2() {
    var locale = new Locale("id", "ID");
    var resouce = ResourceBundle.getBundle("message", locale);

    String pattern = resouce.getString("balance");
    var message = new MessageFormat(pattern, locale);

    System.out.println(message.format(new Object[] { -100000 }));
    System.out.println(message.format(new Object[] { 0 }));
    System.out.println(message.format(new Object[] { 100000 }));
    try {
      var choice = new ChoiceFormat(pattern);
      System.out.println(choice.format(0));
    } catch (IllegalArgumentException e) {
      System.out.println("This : " + e.getMessage());
    }
  }
}
