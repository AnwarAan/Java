package app;

import java.util.Deque;
import java.util.LinkedList;

public class DeQueueApp {
  public static void main(String[] args) {
    Deque<String> deque = new LinkedList<>();

    deque.offerFirst("one");
    deque.offerFirst("two");
    deque.offerFirst("three");

    for (String val : deque) {
      System.out.println(val);
    }

    System.out.println(deque.pollLast());
    System.out.println(deque.pollLast());
    System.out.println(deque.pollLast());
  }
}
