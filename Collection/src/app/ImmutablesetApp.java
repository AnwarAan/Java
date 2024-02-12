package app;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutablesetApp {
  public static void main(String[] args) {
    Set<String> empty = Collections.emptySet();
    Set<String> one = Collections.singleton("Mca");
    Set<String> mutable = new HashSet<>();

    mutable.add("2");
    mutable.add("3");
    Set<String> immutable = Collections.unmodifiableSet(mutable);
    // Set<String> newSet = Set.of("4", "5", "5");
    Set<String> newSet = Set.of("4", "5");

  }
}
