package io.javaio;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WritterTest {
  @Test
  void writter() {
    Path path = Path.of("writter.txt");
    try (Writer writer = Files.newBufferedWriter(path)) {
      for (int i = 0; i < 100; i++) {
        writer.write("Hello MC\n");
        writer.flush();
      }
    } catch (IOException e) {
      Assertions.fail(e);
    }
  }
}
