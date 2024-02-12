package app;

import java.util.function.Consumer;

public class ConsumerApp {
  public static void main(String[] args) {
    // Consumer<String> consumer = new Consumer<String>() {
    // @Override
    // public void accept(String t) {
    // System.out.println(t);
    // }
    // };

    Consumer<String> consumer = value -> System.out.println(value);
    consumer.accept("mca");
  }
}
