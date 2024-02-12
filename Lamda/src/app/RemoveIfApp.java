package app;

import java.util.*;
import java.util.function.Predicate;

public class RemoveIfApp {
  public static void main(String[] args) {
    List<String> names = new ArrayList<>();
    names.addAll(List.of("mca", "aan", "mcnwr76"));

    names.removeIf(new Predicate<String>() {
      @Override
      public boolean test(String t) {
        return t.length() > 5;
      }
    });

    names.removeIf(name -> name.length() > 5);
    System.out.println(names);
  }
}
