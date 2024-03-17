package log.logging;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainTest {
  private static final Logger log = LoggerFactory.getLogger(MainTest.class);

  @Test
  void testMain() {
    System.out.println("Hello");
    log.info("Hello Logger");
  }
}
