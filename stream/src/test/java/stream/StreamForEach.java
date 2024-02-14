package stream;

import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.Test;

public class StreamForEach {
  @Test
  void tetsMax() {
    List.of("A", "B", "C").stream().peek(name -> System.out.println("Upper " + name)).map(name -> name.toUpperCase())
        .forEach(System.out::println);
  }
}
