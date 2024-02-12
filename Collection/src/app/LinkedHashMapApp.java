package app;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapApp {
  public static void main(String[] args) {
    // Map<String, String> map = new LinkedHashMap<>();
    Map<String, String> map = new HashMap<>();

    map.put("1", "one");
    map.put("2", "two");
    map.put("3", "three");

    Set<String> keys = map.keySet();
    for (String key : keys) {
      System.out.println(key);
    }
  }
}
