
import java.data.*;

public class ProductApp {
  public static void main(String[] args) {

    Product product = new Product("Mac", 100000000);
    product.name = "Indomie";
    product.price = 3000;

    System.out.println(product.getName("indomie"));
    System.out.println(product.getPrice(3000));

  }
}
