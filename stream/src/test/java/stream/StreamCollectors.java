package stream;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class StreamCollectors {

  Stream<String> getStream() {
    return Stream.of("mca", "a");
  }

  @Test
  void tetsCollection() {
    Set<String> set = getStream().collect(Collectors.toSet());
    Set<String> immutableSet = getStream().collect(Collectors.toUnmodifiableSet());

    List<String> list = getStream().collect(Collectors.toList());
    List<String> immutableList = getStream().collect(Collectors.toUnmodifiableList());
  }

  @Test
  void tetsMap() {
    Map<String, Integer> map = getStream().collect(Collectors.toMap(name -> name, val -> val.length()));
    System.out.println(map);
  }
}
