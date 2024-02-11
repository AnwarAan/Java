package app;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapApp {
  public static void main(String[] args) {
    Map<String, String> map = new IdentityHashMap<>();
    var key1 = "first.name";

    var first = "first";
    var dot = ".";
    var name = "name";

    var key2 = first + dot + name;

    System.out.println(key1.equals(key2));
    System.out.println(key1 == key2);

    map.put(key1, "null");
    map.put(key2, "null");

    System.out.println(map.size());
  }
}
