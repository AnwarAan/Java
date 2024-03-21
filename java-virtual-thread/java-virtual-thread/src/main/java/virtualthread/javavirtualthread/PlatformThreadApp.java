package virtualthread.javavirtualthread;

import java.lang.Thread;

public class PlatformThreadApp {
  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      Thread thread = Thread.ofPlatform().name("mca-" + i).daemon(false).unstarted(() -> {
        try {
          Thread.sleep(1000);
          System.out.println("Hello " + Thread.currentThread() + "!");
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
      });
      thread.start();
    }
  }
}
