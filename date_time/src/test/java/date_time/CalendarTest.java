package date_time;

import java.util.Calendar;
import java.util.Date;
import org.junit.jupiter.api.Test;

public class CalendarTest {
  @Test
  void testDate1() {
    Calendar calendar = Calendar.getInstance();
    Date date = calendar.getTime();
    System.out.println(date);
    calendar.set(Calendar.YEAR, 0);
  }

  @Test
  void testDate2() {
    Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.YEAR, 2024);
    calendar.set(Calendar.MONTH, Calendar.JANUARY);
    calendar.set(Calendar.DAY_OF_MONTH, 32);
    calendar.set(Calendar.MINUTE, 32);
    calendar.set(Calendar.SECOND, 32);
    calendar.set(Calendar.MILLISECOND, 32);

    Date date = calendar.getTime();
    System.out.println(date);
    calendar.set(Calendar.YEAR, 0);
  }

  @Test
  void testDate3() {
    Calendar calendar = Calendar.getInstance();
    System.out.println(calendar.get(Calendar.YEAR));
    System.out.println(calendar.get(Calendar.MONTH));
    System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
    System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
    System.out.println(calendar.get(Calendar.MINUTE));
    System.out.println(calendar.get(Calendar.SECOND));
    System.out.println(calendar.get(Calendar.MILLISECOND));
  }
}
