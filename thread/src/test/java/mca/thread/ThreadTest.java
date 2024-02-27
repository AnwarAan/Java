package mca.thread;

import org.junit.jupiter.api.Test;

public class ThreadTest {
  @Test
  void mainThread() {
    var name = Thread.currentThread();
    System.out.println(name);
  }

  @Test
  void createThread() {
    Runnable runnable = () -> {
      System.out.println("Hello thread : " + Thread.currentThread().getName());
    };

    var thread = new Thread(runnable);
    thread.start();
    System.out.println(runnable);
  }

  @Test
  void sleepThread() throws InterruptedException {
    Runnable runnable = () -> {
      try {
        Thread.sleep(2000);
        System.out.println("Hello thread : " + Thread.currentThread().getName());
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    };

    var thread = new Thread(runnable);
    thread.start();

    System.out.println("finish");
    Thread.sleep(3_000L);
  }

  @Test
  void joinThread() throws InterruptedException {
    Runnable runnable = () -> {
      try {
        Thread.sleep(2000);
        System.out.println("Hello thread : " + Thread.currentThread().getName());
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    };

    var thread = new Thread(runnable);
    thread.start();
    System.out.println("waiting");
    thread.join();
    System.out.println("finish");
  }

  @Test
  void interrupThread() throws InterruptedException {
    Runnable runnable = () -> {
      for (int i = 0; i < 10; i++) {
        System.out.println("Runnable : " + i);
        try {
          Thread.sleep(2000);
          System.out.println("Hello thread : " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    };

    var thread = new Thread(runnable);
    thread.start();
    Thread.sleep(5_000L);
    thread.interrupt();
    System.out.println("waiting");
    thread.join();
    System.out.println("finish");
  }

  @Test
  void nameThread() throws InterruptedException {
    var thread = new Thread(() -> {
      System.out.println("Run : " + Thread.currentThread().getName());
    });

    thread.setName("T1");
    thread.start();
  }

  @Test
  void stateThread() throws InterruptedException {
    var thread = new Thread(() -> {
      System.out.println(Thread.currentThread().getState());
      System.out.println("Run : " + Thread.currentThread().getName());
    });
    thread.setName("T1");
    System.out.println(thread.getState());

    thread.start();
    thread.join();
    System.out.println(thread.getState());
  }
}
