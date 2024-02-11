package app;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {
  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();
    map.put("1", "one");
    map.put("2", "two");
    map.put("3", "three");

    System.out.println(map.get("1"));
    System.out.println(map.get("2"));
    System.out.println(map.get("3"));
  }
}
