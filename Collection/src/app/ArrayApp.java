package app;

import java.util.Arrays;
import java.util.List;

public class ArrayApp {
  public static void main(String[] args) {
    List<String> names = List.of("1", "2", "3");
    Object[] object = names.toArray();
    String[] strings = names.toArray(new String[] {});

    System.out.println(Arrays.toString(object));
    System.out.println(Arrays.toString(strings));
  }
}
