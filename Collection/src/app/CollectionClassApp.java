package app;

import java.util.*;

public class CollectionClassApp {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.addAll(List.of("1", "2", "3", "4"));
    System.out.println(list);

    Collections.reverse(list);
    System.out.println(list);

    Collections.shuffle(list);
    System.out.println(list);
  }
}
