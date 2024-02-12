package dist.util;

public class Bounded {
  public static void main(String[] args) {
    NumberData<Integer> numberDataInteger = new NumberData<Integer>(100);
    // NumberData<String> numberDataString = new numberDataString<String>("Mca");
    NumberData<Long> numberDataLong = new NumberData<Long>(100L);

  }

  public static class NumberData<T extends Number> {
    private T data;

    public NumberData(T data) {
      this.data = data;
    }
  }
}
