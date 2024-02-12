package app;

import java.util.Optional;
import java.util.function.Function;

public class OptionalApp {
  public static void main(String[] args) {
    sayHello("mca");
    sayHello(null);
  }

  public static void sayHello(String name) {
    // Optional<String> optionalName = Optional.ofNullable(name);
    // Optional<String> optionalNameUpper = optionalName.map(new Function<String,
    // String>() {
    // @Override
    // public String apply(String name) {
    // return name.toUpperCase();
    // }
    // });

    // Optional<String> optionalNameUpper = optionalName.map((value) ->
    // value.toUpperCase());
    // Optional<String> optionalNameUpper2 = optionalName.map(value ->
    // value.toUpperCase());
    // optionalNameUpper.ifPresent(value -> System.out.println("Hello =>" + value));

    Optional.ofNullable(name).map(val -> val.toUpperCase()).ifPresent(val -> System.out.println(val));
    Optional.ofNullable(name).map(String::toUpperCase).ifPresentOrElse((System.out::println),
        () -> System.out.println("Hello"));

    // Optional.ofNullable(name).map(String::toUpperCase).ifPresent(System.out::println);

    String upperName = Optional.ofNullable(name).map(String::toUpperCase).orElse("Firends");
    System.out.println("Hello " + upperName);

    // String upperName = name.toUpperCase();
    // System.out.println("Hello " + upperName);
    // System.out.println("Hello ==>" + optionalNameUpper);
  }
}
