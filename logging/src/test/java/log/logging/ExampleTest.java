package log.logging;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleTest {

  private static final Logger log = LoggerFactory.getLogger(ExampleTest.class);

  @Test
  void testLog() {
    log.error("Contoh");
    log.info("Contoh Info");
  }
}
