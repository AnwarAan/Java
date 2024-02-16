package stream;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import org.junit.jupiter.api.Test;

public class StreamPrimitive {
  @Test
  void tetsCreate() {
    IntStream intStream = IntStream.range(1, 100);
    intStream.forEach(System.out::println);

    LongStream longStream = LongStream.of(1, 2, 3, 4, 5);
    DoubleStream doubleStream = DoubleStream.builder().add(1.2).build();
  }

  @Test
  void tetsAverage() {
    IntStream intStream = IntStream.range(1, 100);
    OptionalDouble optionalDouble = intStream.average();
    optionalDouble.ifPresent(System.out::println);

    IntStream.range(1, 100).mapToObj(num -> "Num " + num).forEach(System.out::println);
  }
}
