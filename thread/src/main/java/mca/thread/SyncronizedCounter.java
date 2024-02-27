package mca.thread;

public class SyncronizedCounter {
  private Long value = 0L;

  public void increment() {
    synchronized (this) {
      value++;
    }
  }

  public Long getValue() {
    return value;
  }
}
