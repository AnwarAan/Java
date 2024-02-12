package app;

import java.util.function.Function;

public class FuncApp {
  public static void main(String[] args) {
    // Function<String, Integer> functionLength = new Function<String, Integer>() {
    // @Override
    // public Integer apply(String val) {
    // return val.length();
    // }
    // };
    Function<String, Integer> functionLength = value -> value.length();
    System.out.println(functionLength.apply("mca"));
  }

}
