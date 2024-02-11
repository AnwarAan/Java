package app;

import java.util.function.Supplier;

public class LazyApp {
  public static void main(String[] args) {
    // testScore(10, "mca");
    testScore(100, () -> getName());
  }

  public static void testScore(int score, Supplier<String> name) {
    if (score > 80) {
      System.out.println("You pass " + name.get());
    } else {
      System.out.println("You doesn't pass ");

    }
  }

  public static String getName() {
    System.out.println("This");
    return "MCA";
  }
}
