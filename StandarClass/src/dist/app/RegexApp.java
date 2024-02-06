package dist.app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp {
  public static void main(String[] args) {
    String name = "Mucahamd Choirul Anwar 76";
    Pattern pattern = Pattern.compile("[a-zA-Z]*[n][a-zA-Z]*");
    Matcher matcher = pattern.matcher(name);

    while (matcher.find()) {
      System.out.println(matcher.group());
    }
  }

}
