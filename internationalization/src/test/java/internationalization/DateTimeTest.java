package internationalization;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.junit.jupiter.api.Test;

public class DateTimeTest {
  @Test
  void testDate() {
    var locale = new Locale("in", "ID");
    var simpleDateFormat = new SimpleDateFormat("EEEE dd MMMM yyyy", locale);
    String format = simpleDateFormat.format(new Date());
    System.out.println(format);
  }

  @Test
  void testDate2() {
    var locale = new Locale("ja", "JP");
    var simpleDateFormat = new SimpleDateFormat("EEEE dd MMMM yyyy", locale);
    String format = simpleDateFormat.format(new Date());
    System.out.println(format);
  }

  @Test
  void testDate3() {
    var locale = new Locale("ja", "JP");
    var simpleDateFormat = new SimpleDateFormat("EEEE dd MMMM yyyy", locale);
    String format = simpleDateFormat.format(new Date());
    System.out.println(format);
    try {
      var date = simpleDateFormat.parse("Rabu 21 Februari 2024");
      System.out.println(date);
    } catch (ParseException e) {
      System.out.println("Error parse : " + e.getMessage());
    }
  }
}
