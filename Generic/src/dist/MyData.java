package Generic.src.dist;

public class MyData<T> {

  private T data;

  public MyData(T data) {
    this.data = data;
  }

  public T getData() {
    return this.data;
  }

  public void setData(T data) {
    this.data = data;
  }
}
