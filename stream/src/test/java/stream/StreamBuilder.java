package stream;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class StreamBuilder {
  @Test
  void testStreamBuilder() {

    Stream.Builder<String> builder = Stream.builder();
    builder.accept("A");
    builder.add("B").add("C");

    Stream<String> stream = builder.build();
    stream.forEach(System.out::println);

    Stream<Object> stream2 = Stream.builder().add("M").add("C").add("A").build();
    stream2.forEach(System.out::println);
  }
}
