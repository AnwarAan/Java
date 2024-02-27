package date_time;

import java.util.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;

import org.junit.jupiter.api.Test;

public class TimezoneTest {
  @Test
  void testTimezone1() {
    TimeZone timeZone = TimeZone.getDefault();
    System.out.println(timeZone);

    TimeZone timeZone2 = TimeZone.getTimeZone("GMT");
    System.out.println(timeZone2);

    String[] timeZone3 = TimeZone.getAvailableIDs();
    System.out.println(Arrays.asList(timeZone3));
  }

  @Test
  void testTimezone2() {
    Date date = new Date();
    System.out.println(date.toString());
    System.out.println(date.toGMTString());
  }

  @Test
  void testTimezone3() {
    Calendar calendar = Calendar.getInstance();
    Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
    System.out.println(calendar2.get(Calendar.HOUR_OF_DAY));
  }
}
