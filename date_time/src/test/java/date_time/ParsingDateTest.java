package date_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.junit.jupiter.api.Test;

public class ParsingDateTest {
  @Test
  void parsing() {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");

    LocalDate localDate = LocalDate.parse("2020 10 25", formatter);
    System.out.println(localDate);

  }

  @Test
  void format() {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");

    LocalDate localDate = LocalDate.parse("2020 10 25", formatter);
    String format = localDate.format(formatter);

    System.out.println(format);

  }

  @Test
  void defaultFormatter() {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");

    LocalDate localDate = LocalDate.parse("2020 10 25", formatter);
    String format = localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);

    System.out.println(format);

  }

  @Test
  void i18n() {

    Locale locale = new Locale("in", "ID");
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MMMM dd", locale);

    LocalDate localDate = LocalDate.of(2020, 1, 1);
    String format = localDate.format(formatter);

    System.out.println(format);

  }
}
