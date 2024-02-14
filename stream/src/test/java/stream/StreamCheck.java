package stream;

import java.util.List;

import org.junit.jupiter.api.Test;

public class StreamCheck {
  @Test
  void tetsAnyMatch() {
    var result = List.of(1, 2, 3, 4, 5).stream().anyMatch(num -> num > 20);
    System.out.println(result);
  }

  @Test
  void tetsAllMatch() {
    var result = List.of(1, 2, 3, 4, 5, 30).stream().allMatch(num -> num > 20);
    System.out.println(result);
  }

  @Test
  void tetsNonMatch() {
    var result = List.of(1, 2, 3, 4, 5, 30).stream().noneMatch(num -> num > 20);
    System.out.println(result);
  }
}
