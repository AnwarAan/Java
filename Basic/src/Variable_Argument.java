public class Variable_Argument {
  public static void main(String[] args) {
    int[] scores = { 100, 90, 80, 60 };
    sayCongrats("MCA", scores);
    sayCongrats2("MC", 100, 200, 40);
  }

  static void sayCongrats(String name, int[] values) {
    var total = 0;
    for (var value : values) {
      total += value;
    }

    var result = total / values.length;

    if (result >= 75) {
      System.out.println("Selamat " + name + ", Anda Lulus");
    } else {
      System.out.println("Maaf " + name + ", Anda Belum Lulus");
    }
  }

  static void sayCongrats2(String name, int... values) {
    var total = 0;
    for (var value : values) {
      total += value;
    }

    var result = total / values.length;

    if (result >= 75) {
      System.out.println("Selamat " + name + ", Anda Lulus");
    } else {
      System.out.println("Maaf " + name + ", Anda Belum Lulus");
    }
  }
}
