package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

public class PreparedStatementTest {
  @Test
  void testPrepareStatement() throws SQLException {
    Connection connection = ConnectionUtil.getDataSource().getConnection();
    String username = "admin'; #";
    String password = "salah";

    String sql = "SELECT * FROM admin WHERE username = ? AND password = ?";

    PreparedStatement preparedStatement = connection.prepareStatement(sql);
    preparedStatement.setString(1, username);
    preparedStatement.setString(2, password);

    ResultSet resultSet = preparedStatement.executeQuery();
    if (resultSet.next()) {
      // sukses login
      System.out.println("Sukses login : " + resultSet.getString("username"));
    } else {
      // gagal login
      System.out.println("Gagal login");
    }

    preparedStatement.close();
    connection.close();
  }
}
