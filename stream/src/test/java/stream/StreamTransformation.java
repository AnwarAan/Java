package stream;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;

public class StreamTransformation {

  @Test
  void testMapOperation() {
    List.of("A", "B", "C").stream().map(name -> name.toUpperCase()).map(upper -> upper.length())
        .forEach(System.out::println);
  }

  @Test
  void testFlatMapOperation() {
    List.of("A", "B", "C").stream().map(name -> name.toUpperCase()).flatMap(upper -> Stream.of(upper, upper.length()))
        .forEach(System.out::println);
  }

}
