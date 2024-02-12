package Generic.src.dist.app;

import Generic.src.dist.MyData;

public class Contravariant {
  public static void main(String[] args) {
    MyData<Object> myData = new MyData<Object>("MCA");
    MyData<? super String> dataString = myData;

    proccess(dataString);
    System.out.println(myData.getData());
  }

  public static void proccess(MyData<? super String> data) {
    String value = (String) data.getData();
    System.out.println("Add " + value);
    data.setData("Disini");
  }

}