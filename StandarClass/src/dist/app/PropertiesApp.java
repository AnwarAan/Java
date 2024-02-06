package dist.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
  public static void main(String[] args) {

    try {
      Properties properties = new Properties();

      properties.load(new FileInputStream("application.properties"));
      properties.getProperty(null);
    } catch (FileNotFoundException e) {
      System.out.println("File Not Found");
    } catch (IOException e) {
      System.out.println("Failed Load File");
    }
  }
}
