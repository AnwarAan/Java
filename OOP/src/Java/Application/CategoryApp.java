package Java.Application;

import Java.Data.Category;

public class CategoryApp {
  public static void main(String[] args) {

    var category = new Category();

    category.setId("1");
    category.setId(null);
    System.out.println(category.getId());
  }
}
