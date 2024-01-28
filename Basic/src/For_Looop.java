public class For_Looop {
  public static void main(String[] args) {

    // for (;;) {

    // System.out.println("Infinite");
    // }

    var count = 1;

    for (; count <= 10;) {
      System.out.println("Loop-" + count);
      count++;
    }

    for (var i = 0; i < 10; i++) {
      System.out.println("loop-" + i);
    }
  }
}
