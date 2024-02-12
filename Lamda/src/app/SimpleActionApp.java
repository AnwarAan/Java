package app;

import lamda.SimpleAction;

public class SimpleActionApp {
  public static void main(String[] args) {

    SimpleAction simpleAction1 = new SimpleAction() {
      @Override
      public String action(String name) {
        return "Hello " + name;
      }
    };

    System.out.println(simpleAction1.action("mca"));

    SimpleAction simpleAction2 = (name) -> {
      return "Hello " + name;
    };

    System.out.println(simpleAction2.action("aan"));

    SimpleAction simpleAction3 = name -> "Hello " + name;
    System.out.println(simpleAction3.action("mcnwr"));
  }
}
