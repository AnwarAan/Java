package resilience4j.javaresilience4j;

import org.junit.jupiter.api.Test;

import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;
import io.github.resilience4j.circuitbreaker.CircuitBreakerRegistry;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CircuitBreakerTest {
  public void callMe() {
    log.info("Call Me");
    throw new IllegalArgumentException();
  }

  @Test
  void testCicuitBreaker() {
    CircuitBreaker circuitBreaker = CircuitBreaker.ofDefaults("mca");

    for (int i = 0; i < 100; i++) {
      try {
        Runnable runnable = CircuitBreaker.decorateRunnable(circuitBreaker, () -> callMe());
        runnable.run();
      } catch (Exception e) {
        log.error("Error : {}", e.getMessage());
      }
    }
  }

  @Test
  void testCircuitBreakerConfig() {
    CircuitBreakerConfig config = CircuitBreakerConfig.custom()
        .slidingWindowType(CircuitBreakerConfig.SlidingWindowType.COUNT_BASED)
        .failureRateThreshold(10f)
        .slidingWindowSize(10)
        .minimumNumberOfCalls(10)
        .build();

    CircuitBreaker circuitBreaker = CircuitBreaker.of("mca", config);

    for (int i = 0; i < 100; i++) {
      try {

        Runnable runnable = CircuitBreaker.decorateRunnable(circuitBreaker, () -> callMe());
        runnable.run();
      } catch (Exception e) {
        log.error("Error : {}", e.getMessage());
      }
    }
  }

  @Test
  void testCircuitBreakerRegistry() {
    CircuitBreakerConfig config = CircuitBreakerConfig.custom()
        .slidingWindowType(CircuitBreakerConfig.SlidingWindowType.COUNT_BASED).failureRateThreshold(10f)
        .slidingWindowSize(10).minimumNumberOfCalls(10).build();

    CircuitBreakerRegistry registry = CircuitBreakerRegistry.ofDefaults();
    registry.addConfiguration("config", config);

    CircuitBreaker circuitBreaker = registry.circuitBreaker("mca", "config");

    for (int i = 0; i < 100; i++) {
      try {
        Runnable runnable = CircuitBreaker.decorateRunnable(circuitBreaker, () -> callMe());
        runnable.run();
      } catch (Exception e) {
        log.info("Error : {}", e.getMessage());
      }
    }
  }

}
