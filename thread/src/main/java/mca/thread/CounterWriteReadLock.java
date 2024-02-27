package mca.thread;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class CounterWriteReadLock {
  private Long value = 0L;

  final private ReadWriteLock lock = new ReentrantReadWriteLock();

  public void increment() {
    try {
      lock.writeLock().lock();
      value++;
    } finally {
      lock.writeLock().unlock();
    }
  }

  public Long getValue() {
    try {
      lock.readLock().lock();
      return value;
    } finally {
      lock.readLock().unlock();
    }
  }
}
