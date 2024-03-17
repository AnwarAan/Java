package resilience4j.javaresilience4j;

import java.time.Duration;
import java.util.function.Supplier;

import org.junit.jupiter.api.Test;

import io.github.resilience4j.retry.Retry;
import io.github.resilience4j.retry.RetryConfig;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RetryRegistryTest {
  String hello() {
    log.info("Call hello()");
    throw new IllegalArgumentException("Ups");
  }

  @Test
  void retryConfig() {
    RetryConfig config = RetryConfig.custom()
        .maxAttempts(5)
        .waitDuration(Duration.ofSeconds(2))
        // .ignoreExceptions(IllegalArgumentException.class)
        // .retryExceptions(IllegalArgumentException.class)
        .build();

    Retry retry = Retry.of("pzn", config);

    Supplier<String> supplier = Retry.decorateSupplier(retry, () -> hello());
    supplier.get();
  }
}
