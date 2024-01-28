public class Recursive {
  public static void main(String[] args) {
    var fac1 = factorial(5);
    var fac2 = factorial2(6);
    loop(100000);
    System.out.println(fac1);
    System.out.println(fac2);
  }

  static int factorial(int values) {
    var result = 1;
    for (var i = 1; i <= values; i++) {
      result *= i;
    }
    return result;
  }

  static int factorial2(int values) {
    if (values == 1) {
      return 1;
    } else {
      return values * factorial2(values - 1);
    }
  }

  static void loop(int val) {
    if (val == 0) {
      System.out.println("finish");
    } else {
      System.out.println("loop-" + val);
      loop(val - 1);
    }
  }
}
