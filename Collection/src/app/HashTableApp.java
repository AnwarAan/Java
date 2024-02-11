package app;

import java.util.*;

public class HashTableApp {
  public static void main(String[] args) {
    Map<String, String> map = new Hashtable<>();

    map.put("1", "one");
    map.put("2", "two");
    map.put("3", "three");

    for (var val : map.keySet()) {
      System.out.println(val);
    }

  }
}
