package stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

public class StreamGrouping {
  @Test
  void testGrouping() {
    Map<Integer, List<Integer>> map = Stream.of(1, 2, 3, 4, 5, 6).collect(Collectors.groupingBy(num -> num));
    System.out.println(map);

    Map<String, List<Integer>> collect = Stream.of(1, 2, 3, 4, 5, 6).collect(Collectors.groupingBy(num -> {
      if (num > 5) {
        return "Big";
      } else {
        return "Small";
      }
    }));
    System.out.println(map);
  }

  @Test
  void testPartioning() {
    Map<Boolean, List<Integer>> collect = Stream.of(1, 2, 3, 4, 5, 6)
        .collect(Collectors.partitioningBy(num -> num > 5));
    System.out.println(collect);
  }

}
