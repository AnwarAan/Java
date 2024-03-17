package resilience4j.javaresilience4j;

import java.time.Duration;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Supplier;

import org.junit.jupiter.api.Test;

import io.github.resilience4j.bulkhead.Bulkhead;
import io.github.resilience4j.bulkhead.BulkheadConfig;
import io.github.resilience4j.bulkhead.BulkheadRegistry;
import io.github.resilience4j.bulkhead.ThreadPoolBulkhead;
import io.github.resilience4j.bulkhead.ThreadPoolBulkheadConfig;
import io.github.resilience4j.bulkhead.ThreadPoolBulkheadRegistry;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BulkheadTest {
  private AtomicLong counter = new AtomicLong(0L);

  @SneakyThrows
  public void slow() {
    Long value = counter.incrementAndGet();
    log.info("Slow : " + value);
    Thread.sleep(1_000L);
  }

  @Test
  void testSemaphore() throws InterruptedException {
    Bulkhead bulkhead = Bulkhead.ofDefaults("mca");
    for (int i = 0; i < 1000; i++) {
      Runnable runnable = Bulkhead.decorateRunnable(bulkhead, () -> slow());
      new Thread(runnable).start();
    }
    Thread.sleep(10_000L);
  }

  @Test
  void testThreadPool() {
    log.info(String.valueOf(Runtime.getRuntime().availableProcessors()));
    ThreadPoolBulkhead bulkhead = ThreadPoolBulkhead.ofDefaults("mca");

    for (int i = 0; i < 1000; i++) {
      Supplier<CompletionStage<Void>> supplier = ThreadPoolBulkhead.decorateRunnable(bulkhead, () -> slow());
      supplier.get();
    }
  }

  @Test
  void testSemaphoreConfig() throws InterruptedException {
    BulkheadConfig config = BulkheadConfig.custom().maxConcurrentCalls(5).maxWaitDuration(Duration.ofSeconds(5))
        .build();
    Bulkhead bulkhead = Bulkhead.of("pzn", config);

    for (int i = 0; i < 1000; i++) {
      Runnable runnable = Bulkhead.decorateRunnable(bulkhead, () -> slow());
      new Thread(runnable).start();
    }

    Thread.sleep(1000L);
  }

  @Test
  void testThreadPoolConfig() throws InterruptedException {
    ThreadPoolBulkheadConfig config = ThreadPoolBulkheadConfig.custom()
        .maxThreadPoolSize(5)
        .coreThreadPoolSize(5)
        .queueCapacity(1)
        .build();

    log.info(String.valueOf(Runtime.getRuntime().availableProcessors()));

    ThreadPoolBulkhead bulkhead = ThreadPoolBulkhead.of("mca", config);

    for (int i = 0; i < 20; i++) {
      Supplier<CompletionStage<Void>> supplier = ThreadPoolBulkhead.decorateRunnable(bulkhead, () -> slow());
      supplier.get();
    }

    Thread.sleep(10_000L);
  }

  @Test
  void testSemaphoreRegistry() throws InterruptedException {
    BulkheadConfig config = BulkheadConfig.custom().maxConcurrentCalls(5).maxWaitDuration(Duration.ofSeconds(5))
        .build();

    BulkheadRegistry registry = BulkheadRegistry.ofDefaults();
    registry.addConfiguration("config", config);

    Bulkhead bulkhead = registry.bulkhead("mca", "config");

    for (int i = 0; i < 10; i++) {
      Runnable runnable = Bulkhead.decorateRunnable(bulkhead, () -> slow());
      new Thread(runnable).start();
    }

    Thread.sleep(1000L);
  }

  @Test
  void testThreadPoolRegistry() throws InterruptedException {
    ThreadPoolBulkheadConfig config = ThreadPoolBulkheadConfig.custom().maxThreadPoolSize(5).coreThreadPoolSize(5)
        .queueCapacity(1).build();

    log.info(String.valueOf(Runtime.getRuntime().availableProcessors()));

    ThreadPoolBulkheadRegistry registry = ThreadPoolBulkheadRegistry.ofDefaults();
    registry.addConfiguration("config", config);

    ThreadPoolBulkhead bulkhead = registry.bulkhead("mca", "config");

    for (int i = 0; i < 100; i++) {
      Supplier<CompletionStage<Void>> supplier = ThreadPoolBulkhead.decorateRunnable(bulkhead, () -> slow());
      supplier.get();
    }

    Thread.sleep(1000L);
  }

}
