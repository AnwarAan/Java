package dist.util;

public class Math {
  public static int sum(int... values) {

    int total = 0;
    // for (var value = 0; value < values.length; value++) {
    // total += value;
    // }
    for (var value : values) {
      total += value;
    }
    return total;
  }
}
