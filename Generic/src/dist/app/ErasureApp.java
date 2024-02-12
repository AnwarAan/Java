package dist.app;

import dist.util.MyData;

public class ErasureApp {
  public static void main(String[] args) {
    MyData myData = new MyData<String>("Mca");

    MyData<Integer> integerMyData = (MyData<Integer>) myData;
    Integer integer = integerMyData.getData();
    System.out.println(integer);
  }

}
