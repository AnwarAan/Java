package stream;

import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.Test;

public class StreamOrdering {

  @Test
  void tetsSorted() {
    List.of("A", "B", "C").stream().sorted().forEach(System.out::println);
  }

  @Test
  void tetsSortedComparator() {
    Comparator<String> comparator = Comparator.reverseOrder();
    List.of("A", "B", "C").stream().sorted(comparator).forEach(System.out::println);
  }

}
