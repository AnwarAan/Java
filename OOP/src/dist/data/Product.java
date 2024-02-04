package dist.data;

public class Product {
  public String name;
  public Integer price;

  public Product(String name, int price) {
    this.name = name;
    this.price = price;
  }

  public String toString() {
    return "Product name : " + name + ", price : " + price;
  }

  // public boolean equals(Object o) {
  // if (this == o)
  // return true;
  // if (!(o instanceof Product))
  // return false;

  // Product product = (Product) o;

  // if (price != product.price)
  // return false;
  // return name != null ? name.equals(product.name) : product.name == null;

  // }

  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;

    Product product = (Product) o;

    if (price != product.price)
      return false;
    return name != null ? name.equals(product.name) : product.name == null;

  }

  public int hasCode() {
    int result = name != null ? name.hashCode() : 0;
    result = 31 * result + price;

    return result;
  }

  public String getName() {
    return name;
  }

}
