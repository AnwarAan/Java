package Generic.src.dist.app;

import Generic.src.dist.MyData;

public class Covariant {
  public static void main(String[] args) {
    MyData<String> myData = new MyData<String>("MCA");
    proccess(myData);
  }

  public static void proccess(MyData<? extends Object> data) {
    Object object = data.getData();
    // data.setData("Mca");
  }
}
