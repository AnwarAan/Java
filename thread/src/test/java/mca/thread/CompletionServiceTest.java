package mca.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.Random;
import org.junit.jupiter.api.Test;

public class CompletionServiceTest {
  private Random random = new Random();

  @Test
  void test() throws InterruptedException {

    var executor = Executors.newFixedThreadPool(10);
    var completionService = new ExecutorCompletionService<String>(executor);

    // submit task
    Executors.newSingleThreadExecutor().execute(() -> {
      for (int i = 0; i < 100; i++) {
        final var index = i;
        completionService.submit(() -> {
          Thread.sleep(random.nextInt(2000));
          return "Task-" + index;
        });
      }
    });

    // poll task
    Executors.newSingleThreadExecutor().execute(() -> {
      while (true) {
        try {
          Future<String> future = completionService.poll(5, TimeUnit.SECONDS);
          if (future == null) {
            break;
          } else {
            System.out.println(future.get());
          }
        } catch (InterruptedException | ExecutionException e) {
          e.printStackTrace();
          break;
        }
      }
    });

    // executor.shutdown();
    executor.awaitTermination(1, TimeUnit.DAYS);

  }
}
