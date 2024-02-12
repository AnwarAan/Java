package app;

import java.util.function.Function;
import java.util.function.Predicate;

import util.StringUtil;

public class MethodReferenceApp {
  public static void main(String[] args) {
    // Predicate<String> predicateIsLowerCase = new Predicate<String>() {
    // @Override
    // public boolean test(String t) {
    // return StringUtil.isLowerCase(t);
    // }
    // };
    // Predicate<String> predicateIsLowerCase = value ->
    // StringUtil.isLowerCase(value);
    Predicate<String> predicateIsLowerCase = StringUtil::isLowerCase;

    System.out.println(predicateIsLowerCase.test("mca"));
    System.out.println(predicateIsLowerCase.test("Mca"));

    // Function<String, String> functionUpper = value -> value.toUpperCase();
    Function<String, String> functionUpper = String::toUpperCase;
  }

  public void run() {
    MethodReferenceApp app = new MethodReferenceApp();
    Predicate<String> predicateIsLowerCase = MethodReferenceApp.this::isLowerCase;

    System.out.println(predicateIsLowerCase.test("mca"));
    System.out.println(predicateIsLowerCase.test("Mca"));
  }

  public boolean isLowerCase(String value) {
    for (var c : value.toCharArray()) {
      if (!Character.isLowerCase(c)) {
        return false;
      }
    }
    return true;
  }

}
