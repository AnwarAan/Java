package app;

import java.util.List;
import java.util.function.Consumer;

public class ForEachApp {
  public static void main(String[] args) {
    List<String> list = List.of("1", "2", "3");
    for (var var : list) {
      System.out.println(var);
    }

    list.forEach(new Consumer<String>() {
      public void accept(String t) {
        System.out.println(t);
      };
    });

    Consumer<String> lamda = value -> System.out.println(value);
    list.forEach(value -> System.out.println(value));
    list.forEach(System.out::println);
  }
}
