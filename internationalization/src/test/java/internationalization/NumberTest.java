package internationalization;

import java.text.NumberFormat;
import java.util.Locale;

import org.junit.jupiter.api.Test;

import com.google.protobuf.TextFormat.ParseException;

public class NumberTest {
  @Test
  void testNumber() {
    var number = NumberFormat.getInstance();
    var format = number.format(100000.255);
    System.out.println(format);
  }

  @Test
  void testNumber2() {
    var locale = new Locale("in", "ID");
    var number = NumberFormat.getInstance(locale);
    var format = number.format(100000.255);
    System.out.println(format);
  }

  @Test
  void testNumber3() {
    var locale = new Locale("in", "ID");
    var number = NumberFormat.getInstance(locale);
    try {
      var format = number.parse("100000.255").doubleValue();
      System.out.println(format);
    } catch (java.text.ParseException e) {
      System.out.println("Error : " + e.getMessage());
    }

  }
}
