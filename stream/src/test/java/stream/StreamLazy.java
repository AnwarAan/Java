package stream;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class StreamLazy {
  @Test
  void tetsStreamLazy() {
    Stream<String> names = List.of("A", "B", "C").stream();
    Stream<String> stream = names.map(val -> {
      System.out.println("New name " + val.toUpperCase());
      return val.toUpperCase();
    });

    stream.forEach(System.out::println);
  }
}
