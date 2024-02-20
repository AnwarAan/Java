package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.mysql.cj.jdbc.Driver;

public class ConnectionTest {

  @BeforeAll
  static void beforeAll() {
    try {
      Driver mysqlDriver = new com.mysql.cj.jdbc.Driver();
      DriverManager.registerDriver(mysqlDriver);
    } catch (SQLException exception) {
      exception.printStackTrace();
    }
  }

  @Test
  void testConnection() {
    String jdbcUrl = "jdbc:mysql://localhost:3306/test?serverTimezone=Asia/Jakarta";
    String username = "root";
    String password = "Megagican12";

    try {
      Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
      connection.close();
      System.out.println("Success Connect Database");
    } catch (SQLException exception) {
      Assertions.fail(exception);
    }
  }
}
