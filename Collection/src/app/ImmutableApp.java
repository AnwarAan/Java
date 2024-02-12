package app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ImmutableApp {
  public static void main(String[] args) {
    List<String> one = Collections.singletonList("One");
    List<String> empty = Collections.emptyList();
    List<String> mutable = new ArrayList<>();

    mutable.add("Mca");
    mutable.add("Choirul");
    List<String> immutable = Collections.unmodifiableList(mutable);
    List<String> element = List.of("One", "Two", "Three");
    // element.add("Four");

    for (String mutablee : mutable) {
      System.out.println(mutablee);
    }

  }

}
