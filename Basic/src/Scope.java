public class Scope {
  public static void main(String[] args) {
    say("");
    say("MCA");
  }

  static void say(String name) {
    String hello = "Hello " + name;
    if (!name.isBlank()) {
      String hi = "Hi " + name;
      System.out.println(hi);
    }

    System.out.println(hello);
    // System.out.println(hi);
  }
}
