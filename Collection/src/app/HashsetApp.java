package app;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashsetApp {
  public static void main(String[] args) {
    Set<String> names = new LinkedHashSet<>();
    // Set<String> names = new HashSet<>();
    names.add("Mca");
    names.add("Choirul");
    names.add("Anwar");
    names.add("Mca");
    names.add("Choirul");
    names.add("Anwar");

    for (String name : names) {
      System.out.println(name);
    }
  }

}
