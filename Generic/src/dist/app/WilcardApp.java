package dist.app;

import dist.util.MyData;

public class WilcardApp {
  public static void main(String[] args) {
    printLength(new MyData<>(100));
    printLength(new MyData<>("Mca"));
    // printLength(MyData < MultipleConstrainApp.Manager > (new
    // MultipleConstrainApp().Manager()));
  }

  public static void printLength(MyData<?> data) {
    System.out.println(data.getData());
  }
}
