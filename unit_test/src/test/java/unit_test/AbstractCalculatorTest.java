package unit_test;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;

@Extensions({
    @ExtendWith(RandomParameterResolverTest.class)
})
public class AbstractCalculatorTest {

  protected Calculator calculator = new Calculator();

  void setup() {
    System.out.println("Before Each");
  }
}
