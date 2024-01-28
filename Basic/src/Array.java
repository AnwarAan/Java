public class Array {
  public static void main(String[] args) {
    String[] arrayString;
    arrayString = new String[3];
    arrayString[0] = "M";
    arrayString[1] = "C";
    arrayString[2] = "A";

    String[] arrayString2 = new String[3];
    Integer[] arrayInteger = new Integer[] {
        10, 20, 30
    };
    Long[] arrayLong = { 10L, 20L, 30L };
    String[][] members = {
        { "A", "B", "C" },
        { "1", "2", "3" },
    };

    System.out.println(members[0][0]);
    System.out.println(arrayLong.length);

  }
}
