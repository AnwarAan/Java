package internationalization;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

import org.junit.jupiter.api.Test;

public class CurrencyTest {
  @Test
  void testCurrency() {
    var locale = new Locale("id", "ID");
    Currency currency = Currency.getInstance(locale);
    System.out.println(currency.getDisplayName());
    System.out.println(currency.getCurrencyCode());
    System.out.println(currency.getSymbol());
  }

  @Test
  void testCurrency2() {
    var locale = new Locale("en", "US");
    Currency currency = Currency.getInstance(locale);
    System.out.println(currency.getDisplayName());
    System.out.println(currency.getCurrencyCode());
    System.out.println(currency.getSymbol());
  }

  @Test
  void testCurrency3() {
    var locale = new Locale("ja", "JP");
    Currency currency = Currency.getInstance(locale);
    System.out.println(currency.getDisplayName());
    System.out.println(currency.getCurrencyCode());
    System.out.println(currency.getSymbol());
  }

  @Test
  void testCurrency4() {
    var locale = new Locale("in", "ID");
    NumberFormat number = NumberFormat.getCurrencyInstance(locale);
    var format = number.format(1000000);
    try {

      var format2 = number.parse("Rp900.333,24").doubleValue();
      System.out.println(format2);
    } catch (ParseException e) {
      System.out.println(e.getMessage());
    }
    System.out.println(format);
  }

}
