package dist.app;

import dist.ArrayHelper;

public class ArrayApp {
  public static void main(String[] args) {

    String[] names = { "A", "B", "C" };
    Integer[] numbers = { 1, 2, 3, 4 };

    System.out.println(ArrayHelper.count(names));
    System.out.println(ArrayHelper.count(numbers));
  }
}
