package dist.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
  public static void main(String[] args) {
    try {
      Properties properties = new Properties();

      properties.load(new FileInputStream("ignore/application.properties"));
      System.out.println(properties.getProperty("name.first"));
      System.out.println(properties.getProperty("address"));
    } catch (FileNotFoundException e) {
      System.out.println("File Not Found");
    } catch (IOException e) {
      System.out.println("Failed Load File");
    }

    try {
      Properties properties = new Properties();
      properties.put("name.last", "Anwar");
      properties.put("database.port", 3000);
      properties.store(new FileOutputStream("ignore/new.properties"), "add");
    } catch (FileNotFoundException e) {
      System.out.println("Error Create File");
    } catch (IOException e) {
      System.out.println("Error Save File");
    }

  }

}
