package dist.app;

import java.util.Base64;

public class EncodeApp {
  public static void main(String[] args) {
    String query = "Learn Java";

    String encode = Base64.getEncoder().encodeToString(query.getBytes());
    System.out.println(encode);

    String decode = new String(Base64.getDecoder().decode(encode));
    System.out.println(decode);
  }

}
