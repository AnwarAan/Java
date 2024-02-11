package app;

import java.util.ArrayList;
import java.util.List;

public class ListApp {
  public static void main(String[] args) {
    List<String> names = new ArrayList<>();

    names.add("Mca");
    names.add("Choirul");
    names.add("Anwar");

    names.set(0, "Mcaa");
    names.remove(1);

    System.out.println(names.get(0));

    for (var name : names) {
      System.out.println(name);
    }
  }

}
