package unit_test;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.Extensions;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

@Execution(ExecutionMode.CONCURRENT)
public class TimeOutTest {
  @Test
  @Timeout(value = 5, unit = TimeUnit.SECONDS)
  void testSlow1() throws InterruptedException {
    Thread.sleep(4000);
  }

  @Test
  @Timeout(value = 5, unit = TimeUnit.SECONDS)
  void testSlow2() throws InterruptedException {
    Thread.sleep(4000);
  }

  @Test
  @Timeout(value = 5, unit = TimeUnit.SECONDS)
  void testSlow3() throws InterruptedException {
    Thread.sleep(4000);
  }
}
