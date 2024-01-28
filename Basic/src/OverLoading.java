public class OverLoading {
  public static void main(String[] args) {
    sayHello();
    sayHello("MCA");
    sayHello("mcnwr", "76");
  }

  static void sayHello() {
    System.out.println("Hello");
  }

  static void sayHello(String fName) {
    System.out.println("Hello " + fName);
  }

  static void sayHello(String fName, String lName) {
    System.out.println("Hello " + fName + " " + lName);
  }
}
