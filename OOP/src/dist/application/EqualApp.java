package dist.application;

import dist.data.Product;

public class EqualApp {
  public static void main(String[] args) {
    String firstName = "Muchamad";
    firstName = "MC " + firstName;

    String lastName = "MC Muchamad";

    System.out.println(firstName);
    System.out.println(lastName);
    System.out.println(firstName == lastName);
    System.out.println(firstName.equals(lastName));
  }

}
