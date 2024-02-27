package date_time;

import java.time.LocalTime;

import org.junit.jupiter.api.Test;

public class LocalTimeTest {
  @Test
  void testLocaleTime1() {
    LocalTime localTime = LocalTime.now();
    LocalTime localTime2 = LocalTime.of(20, 10);
    LocalTime localTime3 = LocalTime.parse("09:10");

    System.out.println(localTime);
    System.out.println(localTime2);
    System.out.println(localTime3);
  }

  @Test
  void testLocaleTime2() {
    LocalTime localTime = LocalTime.now();
    LocalTime localTime2 = localTime.withHour(10);
    LocalTime localTime3 = localTime.withHour(5).withMinute(20).withSecond(30);

    System.out.println(localTime);
    System.out.println(localTime2);
    System.out.println(localTime3);
  }

  @Test
  void testLocaleTime3() {
    LocalTime localTime = LocalTime.now();
    LocalTime localTime2 = localTime.plusHours(10);
    LocalTime localTime3 = localTime.plusHours(5).plusMinutes(20).plusSeconds(30);

    System.out.println(localTime);
    System.out.println(localTime2);
    System.out.println(localTime3);
  }

  @Test
  void testLocaleTime4() {
    LocalTime localTime = LocalTime.now();

    System.out.println(localTime.getHour());
    System.out.println(localTime.getMinute());
    System.out.println(localTime.getSecond());
    System.out.println(localTime.getNano());
  }
}
