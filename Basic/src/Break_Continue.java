public class Break_Continue {
  public static void main(String[] args) {
    var count = 1;
    while (true) {
      System.out.println("loop-" + count);
      count++;
      if (count > 10) {
        break;
      }
    }
    System.out.println("stop");

    while (count < 100) {
      count++;
      if (count % 2 == 0) {
        continue;
      }
      System.out.println("loop-" + count);
    }
  }

}
