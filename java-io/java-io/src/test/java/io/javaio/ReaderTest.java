package io.javaio;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReaderTest {
  @Test
  void read() {
    Path path = Path.of("output.txt");

    try (Reader reader = Files.newBufferedReader(path)) {
      StringBuilder builder = new StringBuilder();
      int character;
      int counter = 0;

      while ((character = reader.read()) != -1) {
        builder.append((char) character);
        counter++;
      }

      System.out.println(builder.toString());
      System.out.println(counter);
    } catch (IOException e) {
      Assertions.fail(e);
    }
  }
}
