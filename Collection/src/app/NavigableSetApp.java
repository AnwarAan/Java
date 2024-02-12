package app;

import java.util.Collection;
import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
  public static void main(String[] args) {
    NavigableSet<String> names = new TreeSet<>();
    names.addAll(Set.of("Mca", "Choirul", "lima", "sepuluh"));
    // NavigableSet<String> namesReverse = names.descendingSet();
    NavigableSet<String> namesReverse = names.headSet("lima", true);

    for (String name : namesReverse) {
      System.out.println(name);
    }

    // NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);
    // immutable.add("dua");

  }

}
