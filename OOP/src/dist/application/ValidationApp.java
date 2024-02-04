package dist.application;

import dist.data.Login;
import dist.util.ValidateRuntime;
import dist.util.Validation;

public class ValidationApp {
  public static void main(String[] args) {

    Login login = new Login("mca", null);

    // try {
    // Validation.validation(login);
    // } catch (NullPointerException e) {
    // System.out.println("ERROR -> " + e.getMessage());
    // } catch (Exception e) {
    // System.out.println("ERROR -> " + e.getMessage());
    // }

    try {
      Validation.validation(login);
    } catch (Exception e) {
      System.out.println("ERROR -> " + e.getMessage());
    } finally {
      System.out.println("Lancar jaya");
    }

    Login login2 = new Login("mca", null);
    ValidateRuntime.validateRuntime(login2);
  }
}
