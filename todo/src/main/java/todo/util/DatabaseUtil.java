package todo.util;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class DatabaseUtil {
  private static HikariDataSource hikariDataSource;

  static {
    HikariConfig config = new HikariConfig();
    config.setDriverClassName("com.mysql.cj.jdbc.Driver");
    config.setUsername("root");
    config.setPassword("Megagican12");
    config.setJdbcUrl("jdbc:mysql://localhost:3306/test?serverTimezone=Asia/Jakarta");

    config.setMaximumPoolSize(10);
    config.setMaximumPoolSize(2);
    config.setIdleTimeout(60_000);
    config.setMaxLifetime(3_600_000);

    hikariDataSource = new HikariDataSource(config);
  }

  public static HikariDataSource getDataSource() {
    return hikariDataSource;
  }

}
