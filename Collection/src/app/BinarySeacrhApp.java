package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySeacrhApp {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();

    for (int i = 0; i < 10000; i++) {
      list.add(i);
    }

    Integer index = Collections.binarySearch(list, 200);
    System.out.println(index);

    Comparator<Integer> comparator = new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
      }
    };

    int index2 = Collections.binarySearch(list, 500);
    System.out.println(index2);
  }
}
