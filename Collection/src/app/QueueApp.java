package app;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {
  public static void main(String[] args) {
    // Queue<String> queue = new ArrayDeque<>(10);
    // Queue<String> queue = new LinkedList<>();
    Queue<String> queue = new PriorityQueue<>();

    queue.add("tiga");
    queue.add("satu");

    for (int i = 0; i < 20; i++) {
      queue.add(String.valueOf(i));
    }

    for (String next = queue.poll(); next != null; next = queue.poll()) {
      System.out.println(next);
    }

    System.out.println(queue.size());
  }
}
