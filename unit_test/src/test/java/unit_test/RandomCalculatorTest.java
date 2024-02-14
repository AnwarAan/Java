package unit_test;

import java.util.Random;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class RandomCalculatorTest {

  @Test
  void testRandom(TestInfo info, Random random) {
    var a = random.nextInt();
    var b = random.nextInt();

  }
}
