package Java.Data;

public record Login(String name, String password) {
  public Login {
    System.out.println("Login Berhasil");
  }

  public Login(String name) {
    this(name, "pass");
  }

  public Login() {
    this("", "");
  }
}
