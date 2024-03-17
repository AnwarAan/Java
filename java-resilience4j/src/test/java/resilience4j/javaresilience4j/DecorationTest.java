package resilience4j.javaresilience4j;

import java.time.Duration;
import java.util.function.Supplier;

import org.junit.jupiter.api.Test;

import io.github.resilience4j.decorators.Decorators;
import io.github.resilience4j.ratelimiter.RateLimiter;
import io.github.resilience4j.ratelimiter.RateLimiterConfig;
import io.github.resilience4j.retry.Retry;
import io.github.resilience4j.retry.RetryConfig;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DecorationTest {
  @SneakyThrows
  public void slow() {
    log.info("Slow");
    Thread.sleep(1000L);
    throw new IllegalArgumentException();
  }

  @SneakyThrows
  public String sayHello() {
    log.info("say hello");
    Thread.sleep(1000L);
    throw new IllegalArgumentException("Error");
  }

  @Test
  void testDecorator() throws InterruptedException {
    RateLimiter limiter = RateLimiter.of("mca-ratelimiter",
        RateLimiterConfig.custom().limitForPeriod(5).limitRefreshPeriod(Duration.ofMinutes(1)).build());

    Retry retry = Retry.of("mca-retry",
        RetryConfig.custom().maxAttempts(10).waitDuration(Duration.ofMinutes(10)).build());

    Runnable runnable = Decorators.ofRunnable(() -> slow()).withRetry(retry).withRateLimiter(limiter).decorate();

    for (int i = 0; i < 100; i++) {
      new Thread(runnable).start();
    }

    Thread.sleep(10000);
  }

  @Test
  void testFallback() throws InterruptedException {
    RateLimiter rateLimiter = RateLimiter.of("mca-ratelimiter",
        RateLimiterConfig.custom().limitForPeriod(5).limitRefreshPeriod(Duration.ofMinutes(1)).build());

    Retry retry = Retry.of("mca-retry",
        RetryConfig.custom().maxAttempts(10).waitDuration(Duration.ofMillis(10)).build());
    Supplier<String> supplier = Decorators.ofSupplier(() -> sayHello()).withRetry(retry).withRateLimiter(rateLimiter)
        .withFallback(throwable -> "Hello guest").decorate();

    System.out.println(supplier.get());
  }
}
