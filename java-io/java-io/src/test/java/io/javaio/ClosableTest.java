package io.javaio;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClosableTest {
  @Test
  void closeID() {
    Path path = Path.of("pom.xml");
    InputStream inputStream = null;
    try {
      inputStream = Files.newInputStream(path);
    } catch (IOException e) {
      Assertions.fail(e);
    } finally {
      if (inputStream != null) {
        try {
          inputStream.close();
        } catch (IOException e) {
          Assertions.fail(e);
        }
      }
    }
  }

  @Test
  void closedIOWithTryResource() {
    Path path = Path.of("pom.xml");
    try (InputStream inputStream = Files.newInputStream(path);
        InputStream inputStream2 = Files.newInputStream(path);
        InputStream inputStream3 = Files.newInputStream(path);) {
    } catch (IOException e) {
      Assertions.fail(e);
    }
  }
}
