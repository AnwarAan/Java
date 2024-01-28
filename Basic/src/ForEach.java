public class ForEach {
  public static void main(String[] args) {
    String[] arr = {
        "A", "B", "C", "D", "E", "F"
    };

    for (var i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }

    for (var value : arr) {
      System.out.println("-->" + value);
    }

  }
}
