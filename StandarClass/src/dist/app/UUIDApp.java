package dist.app;

import java.util.UUID;

public class UUIDApp {
  public static void main(String[] args) {
    UUID uuid = UUID.randomUUID();
    String key = uuid.toString();

    System.out.println(uuid);
    System.out.println(key);
  }

}
