package stream;

import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.Test;

public class StreamAgregate {
  @Test
  void tetsMax() {
    List.of("A", "B", "C").stream().max(Comparator.naturalOrder()).ifPresent(System.out::println);
  }

  @Test
  void tetsMin() {
    var count = List.of("A", "B", "C").stream().count();
    System.out.println(count);
  }

  @Test
  void tetsReduce() {
    var result = List.of(1, 2, 3, 4, 5).stream().reduce(0, (a, b) -> a + b);
    System.out.println(result);
  }

  @Test
  void tetsFactorial() {
    var result = List.of(1, 2, 3, 4, 5).stream().reduce(1, (a, b) -> a * b);
    System.out.println(result);
  }
}
