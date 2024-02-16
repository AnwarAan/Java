package unit_test;

<<<<<<< HEAD
import java.util.List;
import java.util.Random;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

@Extensions({
    @ExtendWith(RandomParameterResolverTest.class)
})
public class RandomCalculatorTest extends AbstractCalculatorTest {

  private Calculator calculator = new Calculator();

  @Test
  void testRandom(Random random) {
    var a = random.nextInt();
    var b = random.nextInt();

    var result = calculator.add(a, b);
    var expected = a + b;

    Assertions.assertEquals(expected, result);
  }

  @DisplayName("Test random")
  @RepeatedTest(value = 10, name = "{displayName}")
  void testRandomRepeat(Random random) {
    var a = random.nextInt();
    var b = random.nextInt();

    var result = calculator.add(a, b);
    var expected = a + b;

    Assertions.assertEquals(expected, result);
  }

  @DisplayName("Test random")
  @RepeatedTest(value = 10, name = "{displayName}")
  void testRandomRepeatInfo(TestInfo info, Random random, RepetitionInfo repetitionInfo) {
    System.out
        .println(info.getDisplayName() + " ke " + repetitionInfo.getCurrentRepetition() + " dari "
            + repetitionInfo.getTotalRepetitions());
    var a = random.nextInt();
    var b = random.nextInt();

    var result = calculator.add(a, b);
    var expected = a + b;

    Assertions.assertEquals(expected, result);
  }

  @DisplayName("Test random")
  @ParameterizedTest(name = "{displayName} with parameter {0}")
  @ValueSource(ints = { 1, 2, 3, 4, 5, 6, 7, 8 })
  void testWithParameter(Integer value) {
    var expected = value + value;
    var result = calculator.add(value, value);

    Assertions.assertEquals(expected, result);
  }

  public static List<Integer> parameterSource() {
    return List.of(1, 2, 3, 4, 5, 6, 7, 8);
  }

  @DisplayName("Test random")
  @ParameterizedTest(name = "{displayName} with parameter {0}")
  @MethodSource({ "parameterSource" })

  void testWithMethodSource(Integer value) {
    var expected = value + value;
    var result = calculator.add(value, value);

    Assertions.assertEquals(expected, result);
=======
import java.util.Random;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class RandomCalculatorTest {

  @Test
  void testRandom(TestInfo info, Random random) {
    var a = random.nextInt();
    var b = random.nextInt();

>>>>>>> 53069211b0d5e059db40b6baadced593778d08ad
  }
}
