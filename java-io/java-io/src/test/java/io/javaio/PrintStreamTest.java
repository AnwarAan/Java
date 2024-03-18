package io.javaio;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrintStreamTest {
  @Test
  void console() {
    PrintStream stream = System.out;
    stream.println("Hello");
    stream.println("Hello");
    stream.println("Hello");
  }

  @Test
  void printStream() {
    Path path = Path.of("print.txt");

    try (OutputStream outputStream = Files.newOutputStream(path)) {
      PrintStream stream = new PrintStream(outputStream);

      stream.println("Hello");
      stream.println("Hello");
      stream.println("Hello");
    } catch (IOException e) {
      Assertions.fail(e);
    }
  }
}
