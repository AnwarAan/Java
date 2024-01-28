public class Method {
  public static void main(String[] args) {
    sayHello();
    sayHello2("m", "anwar");
    var res = sum(10, 20);
    var calculator1 = calc(10, "+", 10);
    var calculator2 = calc(10, "/", 2);
    System.out.println(res);
    System.out.println(calculator1);
    System.out.println(calculator2);
  }

  static void sayHello() {
    System.out.println("Hello");
  }

  static void sayHello2(String fName, String lName) {
    System.out.println("Hello " + fName + " " + lName);
  }

  static int sum(int val1, int val2) {
    var total = val1 + val2;
    return total;
  }

  static int calc(Integer val1, String sign, Integer val2) {
    switch (sign) {
      case "+":
        return val1 + val2;
      case "-":
        return val1 - val2;
      case "*":
        return val1 * val2;
      case "/":
        return val1 / val2;
      default:
        return 0;
    }
  }
}
