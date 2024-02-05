package dist.application;

import dist.error.DatabaseError;

public class DatabaseApp {
  public static void main(String[] args) {

    connectDatabase("mca", "null");
  }

  public static void connectDatabase(String username, String password) {
    if (username == null || password == null) {
      throw new DatabaseError("not null");
    }
  }
}
