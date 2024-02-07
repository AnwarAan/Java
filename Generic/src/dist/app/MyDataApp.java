package dist.app;

import dist.MyData;

public class MyDataApp {
  public static void main(String[] args) {
    MyData<String> stringMyData = new MyData<String>("MCA");
    MyData<Integer> integerMyData = new MyData<Integer>(100);

    stringMyData.setData("Anwar");
    System.out.println(stringMyData.getData());
    System.out.println(integerMyData.getData());
  }

}
