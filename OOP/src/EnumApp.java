public class EnumApp {
  public static void main(String[] args) {
    Customer customer = new Customer();

    customer.setName("MCA");
    customer.setLevel(Level.PREMIUM);

    String levelString = Level.STANDAR.name();
    Level level = Level.valueOf("PREMIUM");
    Level[] values = Level.values();

    System.out.println(customer.getName());
    System.out.println(customer.getLevel());
    System.out.println(customer.getLevel().getDescription());

    System.out.println(levelString);
    System.out.println(level);
    System.out.println(values);

  }
}
