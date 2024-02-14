package stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class StreamPararel {
  @Test
  void testSequential() {
    Stream.of(1, 2, 3, 4, 5, 6).forEach(num -> {
      System.out.println(Thread.currentThread().getName() + " : " + num);
    });
  }

  @Test
  void testPararel() {
    Stream.of(1, 2, 3, 4, 5, 6).parallel().forEach(num -> {
      System.out.println(Thread.currentThread().getName() + " : " + num);
    });
  }
}
