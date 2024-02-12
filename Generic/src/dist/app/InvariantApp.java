package Generic.src.dist.app;

// import dist.MyData;
import Generic.src.dist.MyData;

public class InvariantApp {
  public static void main(String[] args) {
    MyData<String> dataString = new MyData<>("MCA");
    // MyData<Object> dataObject = dataString;

    MyData<Object> data = new MyData<>(100);
    // MyData<Integer> dataInteger = data

    // doIt(dataString);
  }

  public static void doIt(MyData<Object> object) {

  }
}
