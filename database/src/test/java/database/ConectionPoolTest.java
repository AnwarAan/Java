package database;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class ConectionPoolTest {
  @Test
  void tetsHikariCP() {
    HikariConfig config = new HikariConfig();
    config.setDriverClassName("com.mysql.cj.jdbc.Driver");
    config.setJdbcUrl("jdbc:mysql://localhost:3306/test?serverTimezone=Asia/Jakarta");
    config.setUsername("root");
    config.setPassword("Megagican12");

    config.setMaximumPoolSize(10);
    config.setMinimumIdle(5);
    config.setIdleTimeout(60_000);
    config.setMaxLifetime(10 * 60_000);

    try {
      HikariDataSource dataSource = new HikariDataSource(config);
      Connection connection = dataSource.getConnection();
      connection.close();
      dataSource.close();
    } catch (SQLException exception) {
      Assertions.fail(exception);
    }
  }

  @Test
  void testUtil() throws SQLException {
    Connection connection = ConnectionUtil.getDataSource().getConnection();
  }
}
