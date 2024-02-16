package stream;

import java.util.List;

import org.junit.jupiter.api.Test;

public class StreamPipeline {
  @Test
  void testStreamPipeline() {
    List.of("mca", "anwar").stream().map(name -> name.toUpperCase()).map(upper -> "Mr. " + upper)
        .forEach(System.out::println);
  }
}
