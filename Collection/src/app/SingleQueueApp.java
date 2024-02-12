package app;

import java.util.Queue;

import collection.SingleQueue;

public class SingleQueueApp {
  public static void main(String[] args) {
    Queue<String> queue = new SingleQueue<>();

    System.out.println(queue.offer("mca"));
    System.out.println(queue.offer("anwar"));
    System.out.println(queue.offer("aan"));
    System.out.println(queue.size());
    System.out.println(queue.peek());
    System.out.println(queue.poll());

  }
}
