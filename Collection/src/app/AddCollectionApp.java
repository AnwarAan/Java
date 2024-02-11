package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class AddCollectionApp {
  public static void main(String[] args) {
    Collection<String> names = new ArrayList<>();
    names.add("Mca");
    names.add("Choirul");
    names.addAll(Arrays.asList("Anwar", "mcnwr76"));

    for (var name : names) {
      System.out.println(name);
    }

    System.out.println("--------------------------------------------");

    names.remove("Mca");
    names.removeAll(List.of("Anwar", "mcnwr76"));

    for (var name : names) {
      System.out.println(name);
    }

    System.out.println(names.contains("Choirul"));
    System.out.println(names.containsAll(List.of("Mca", "")));
  }
}
