package app;

import java.util.Stack;

public class StackApp {
  public static void main(String[] args) {
    Stack<String> stack = new Stack<>();

    stack.push("1");
    stack.push("2");
    stack.push("3");
    stack.push("4");

    for (var val : stack) {
      System.out.println(val);
    }
  }
}
