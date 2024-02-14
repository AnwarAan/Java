package stream;

import java.util.List;

import org.junit.jupiter.api.Test;

public class StreamFilter {
  @Test
  void testFilter() {
    List<String> names = List.of("A", "B", "C");
    names.stream().filter(name -> name.length() > 5).forEach(System.out::println);
    names.stream().distinct().forEach(System.out::println);

    List.of(1, 2, 3, 4, 5, 6, 7, 8).stream().filter(num -> num % 2 == 0)
        .forEach(System.out::println);
  }

  // distict -> singel data
}
