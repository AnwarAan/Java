package dist.application;

import dist.data.Product;

public class ProductApp {
  public static void main(String[] args) {
    Product product = new Product("Mac", 20000000);

    System.out.println(product.name);
    System.out.println(product.price);

    System.out.println(product);

    Product product2 = new Product("Mac", 20000000);
    System.out.println(product.equals(product2));
    System.out.println(product.hasCode() == product2.hasCode());

  }

}
