package app;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapForEachApp {
  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();
    map.put("1", "one");
    map.put("2", "two");
    map.put("3", "three");

    for (var entry : map.entrySet()) {
      System.out.println(entry.getKey() + " : " + entry.getValue());
    }

    map.forEach(new BiConsumer<String, String>() {
      public void accept(String key, String value) {
        System.out.println(key + " : " + value);
      };
    });

    map.forEach((key, value) -> System.out.println(key + " : " + value));
  }
}
