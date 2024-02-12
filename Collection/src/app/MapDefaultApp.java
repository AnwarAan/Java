package app;

import java.util.*;
import java.util.function.BiConsumer;

public class MapDefaultApp {
  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();
    map.put("1", "one");
    map.put("2", "two");
    map.put("3", "three");

    map.forEach(new BiConsumer<String, String>() {
      @Override
      public void accept(String t, String u) {
        System.out.println(t + " : " + u);
      }
    });
  }
}
