package unit_test;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class QueueTest {

  private Queue<String> queue;

  @Nested
  @DisplayName("When New")
  public class WhenNew {

    @BeforeEach
    void setup() {
      queue = new LinkedList<>();
    }

    @Test
    @DisplayName("when offer test must be 1")
    void offerNewData() {
      queue.offer("mca");
      Assertions.assertEquals(1, queue.size());
    }

    @Test
    @DisplayName("when offer data test must be 2")
    void offerMoreData() {
      queue.offer("mca");
      queue.offer("choirul");
      Assertions.assertEquals(2, queue.size());
    }
  }
}
