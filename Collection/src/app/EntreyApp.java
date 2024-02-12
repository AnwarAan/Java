package app;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntreyApp {
  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();

    map.put("1", "one");
    map.put("2", "two");
    map.put("3", "three");

    Set<Map.Entry<String, String>> entry = map.entrySet();

    for (var en : entry) {
      System.out.println(en.getKey() + " : " + en.getValue());
    }
  }
}
