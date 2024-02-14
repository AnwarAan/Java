package stream;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class StreamOperation {
  @Test
  void testStreamOperation() {
    List<String> list = List.of("mca", "choirul", "anwar");
    Stream<String> streamName = list.stream();
    Stream<String> streamUpperName = streamName.map(name -> name.toUpperCase());
    streamUpperName.forEach(System.out::println);

  }
}
