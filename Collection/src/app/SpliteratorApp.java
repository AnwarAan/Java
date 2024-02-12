package app;

import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class SpliteratorApp {
  public static void main(String[] args) {
    List<String> list = List.of("1", "2", "3", "4", "5");
    Spliterator<String> spliterator1 = list.spliterator();
    Spliterator<String> spliterator2 = spliterator1.trySplit();

    System.out.println(spliterator1.estimateSize());
    System.out.println(spliterator2.estimateSize());

    spliterator1.forEachRemaining(new Consumer<String>() {
      @Override
      public void accept(String t) {
        System.out.println(t);
      }
    });
    System.out.println("----------");
    spliterator2.forEachRemaining(new Consumer<String>() {
      @Override
      public void accept(String t) {
        System.out.println(t);
      }
    });
  }
}
