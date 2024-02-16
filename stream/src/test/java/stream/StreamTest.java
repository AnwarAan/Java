package stream;

import java.util.*;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class StreamTest {

  @Test
  void testStreamString() {
    Stream<String> emptyStream = Stream.empty();
    Stream<String> oneStram = Stream.of("mca");
    String data = null;
    Stream<String> nullStream = Stream.ofNullable(data);

    emptyStream.forEach(val -> {
      System.out.println(val);
    });

    oneStram.forEach(val -> {
      System.out.println(val);
    });

    nullStream.forEach(val -> {
      System.out.println(val);
    });
  }

  @Test
  void testStreamArray() {
    Stream<String> stringStream = Stream.of("mca", "choirul", "anwar");
    Stream<Integer> integerStream = Stream.of(1, 2, 3, 4);

    String[] arrayString = new String[] {
        "A", "B", "C"
    };
    Stream<String> streamArray = Arrays.stream(arrayString);

    integerStream.forEach(System.out::println);
    stringStream.forEach(name -> System.out.println(name));
    streamArray.forEach(System.out::println);
  }

  @Test
  void testStreamCollection() {
    Collection<String> collection = List.of("mca", "choirul", "anwar");
    Stream<String> stringStream = collection.stream();
    stringStream.forEach(System.out::println);
  }

  @Test
  void testStreamInfinite() {
    Stream<String> streamInfinite = Stream.generate(() -> "mca");
    streamInfinite.forEach(System.out::println); // infinite

    Stream<Integer> streamInteger = Stream.iterate(1, val -> val + 1);
    streamInteger.forEach(System.out::println); // infinite
  }
}
