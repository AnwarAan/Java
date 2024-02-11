package app;

import java.util.*;

public class VectorApp {
  public static void main(String[] args) {

    List<String> list = new Vector<>();
    list.add("1");
    list.add("2");
    list.add("3");

    for (var val : list) {
      System.out.println(val);
    }
  }
}
