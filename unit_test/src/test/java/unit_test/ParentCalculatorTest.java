package unit_test;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;

@Extensions(value = { @ExtendWith(RandomParameterResolverTest.class) })
public class ParentCalculatorTest {

  protected Calculator calculator = new Calculator();
}
