package internationalization;

import java.util.Locale;

import org.junit.jupiter.api.Test;

public class LocaleTest {

  @Test
  void testNewLocale() {
    String language = "id";
    String country = "ID";

    var locale = new Locale(language, country);

    System.out.println(locale.getLanguage());
    System.out.println(locale.getCountry());
    System.out.println(locale.getDisplayLanguage());
    System.out.println(locale.getDisplayCountry());
  }
}
