package dist.application;

import dist.data.Login;

public class RecordApp {
  public static void main(String[] args) {

    Login login = new Login("MCA", "1234");
    System.out.println(login);
    System.out.println(login.name());
    System.out.println(login.password());
  }
}
