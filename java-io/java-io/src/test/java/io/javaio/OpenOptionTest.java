package io.javaio;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OpenOptionTest {
  @Test
  void append() {
    Path path = Path.of("append.txt");

    try (Writer writer = Files.newBufferedWriter(path, StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {
      writer.write("Hello\n");
      writer.flush();
    } catch (IOException e) {
      Assertions.fail(e);
    }
  }

}
