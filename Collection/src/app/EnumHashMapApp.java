package app;

import java.util.EnumMap;
import java.util.Map;

public class EnumHashMapApp {
  public static enum Level {
    FREE, STANDAR, PREMIUM, VIP
  }

  public static void main(String[] args) {
    Map<Level, String> map = new EnumMap<>(Level.class);
    map.put(Level.FREE, "One");
    map.put(Level.STANDAR, "Two");

    for (var key : map.keySet()) {
      System.out.println(map.get(key));
    }
  }
}
