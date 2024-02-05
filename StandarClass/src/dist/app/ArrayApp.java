package dist.app;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayApp {
  public static void main(String[] args) {
    int[] numbers = {
        12, 2, 4, 235, 26, 7, 68, 245, 131,
    };

    Arrays.sort(numbers);
    System.out.println(Arrays.toString(numbers));
    System.out.println(Arrays.binarySearch(numbers, 235));
    System.out.println(Arrays.binarySearch(numbers, 400));

    int[] newNum = Arrays.copyOf(numbers, 5);
    System.out.println(Arrays.toString(newNum));
    int[] newNum2 = Arrays.copyOfRange(numbers, 5, 11);
    System.out.println(Arrays.toString(newNum2));
  }

}
