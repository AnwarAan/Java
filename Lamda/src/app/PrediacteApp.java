package app;

import java.util.function.Predicate;

public class PrediacteApp {
  public static void main(String[] args) {
    Predicate<String> predicate = value -> value.isBlank();

    System.out.println(predicate.test("mca"));
    System.out.println(predicate.test(""));
  }
}
