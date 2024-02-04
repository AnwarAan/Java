package dist.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadApp {
  public static void main(String[] args) {
    BufferedReader reader = null;

    // try {
    // reader = new BufferedReader(
    // new FileReader("README.md"));

    // while (true) {
    // String text = reader.readLine();
    // if (text == null) {
    // break;
    // }
    // System.out.println(text);
    // }
    // } catch (Exception e) {
    // System.out.println("FILE ERROR " + e.getMessage());
    // } finally {
    // if (reader != null) {
    // try {
    // reader.close();
    // System.out.println("SUCCESS CLOSE");
    // } catch (IOException exception) {
    // System.out.println("ERROR CLOSE" + exception.getMessage());
    // }
    // }

    // }

    try (BufferedReader reader2 = new BufferedReader(new FileReader("README.md"))) {
      while (true) {
        String text = reader2.readLine();
        if (text == null) {
          break;
        }
        System.out.println(text);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
