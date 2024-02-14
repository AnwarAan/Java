package stream;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class StreamRetrieving {
  @Test
  void tetsLimit() {
    List.of("A", "B", "C").stream().limit(2).forEach(System.out::println);
  }

  @Test
  void tetsSkip() {
    List.of("A", "B", "C").stream().skip(2).forEach(System.out::println);
  }

  @Test
  void tetsTakeWhile() {
    List.of("A", "B", "C").stream().takeWhile(name -> name.length() <= 2).forEach(System.out::println);
  }

  @Test
  void tetsDropWhile() {
    List.of("A", "B", "C").stream().dropWhile(name -> name.length() <= 2).forEach(System.out::println);
  }

  @Test
  void tetsSingle() {
    Optional<String> optional = List.of("A", "B", "C").stream().findAny();
    optional.ifPresent(System.out::println);
  }

  @Test
  void tetsFindFirst() {
    Optional<String> optional = List.of("A", "B", "C").stream().findFirst();
    optional.ifPresent(System.out::println);
  }
}
