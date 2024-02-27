package date_time;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.Test;

public class LocalDateTest {
  @Test
  void testLocalDate1() {
    LocalDate localDate = LocalDate.now();
    LocalDate localDate2 = LocalDate.of(2024, Month.JANUARY, 10);
    LocalDate localDate3 = LocalDate.parse("2024-01-01");

    System.out.println(localDate);
    System.out.println(localDate2);
    System.out.println(localDate3);
  }

  @Test
  void testLocalDate2() {
    LocalDate localDate = LocalDate.now();
    LocalDate localDate2 = localDate.withYear(1990);
    LocalDate localDate3 = localDate.withYear(1990).withMonth(1);

    System.out.println(localDate);
    System.out.println(localDate2);
    System.out.println(localDate3);
  }

  @Test
  void testLocalDate3() {
    LocalDate localDate = LocalDate.now();

    System.out.println(localDate.getYear());
    System.out.println(localDate.getMonth());
    System.out.println(localDate.getDayOfYear());
    System.out.println(localDate.getDayOfMonth());
    System.out.println(localDate.getDayOfWeek());
  }
}
