package app;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
  public static void main(String[] args) {

    NavigableMap<String, String> map = new TreeMap<>();
    map.put("1", "one");
    map.put("2", "two");
    map.put("3", "three");

    for (var key : map.keySet()) {
      System.out.println(key);
    }

    System.out.println(map.lowerKey("2"));
    NavigableMap<String, String> mapDesc = map.descendingMap();
    System.out.println("-------------------------------------------------------");
    for (var key : mapDesc.keySet()) {
      System.out.println(key);
    }

    NavigableMap<String, String> empty = Collections.emptyNavigableMap();
    NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(mapDesc);
    // immutable.put("null", "null");

  }
}
