
public class Product {
  protected String name;
  protected Integer price;

  public Product(String name, Integer price) {
    this.name = name;
    this.price = price;
  }

  public String getName(String name) {
    return name;
  }

  public Integer getPrice(Integer price) {
    return price;
  }
}
