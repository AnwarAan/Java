package io.javaio;

import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PathTest {
  @Test
  void createPath() {
    Path path = Path.of("file.txt");

    Assertions.assertEquals("file.txt", path.toString());
    Assertions.assertFalse(path.isAbsolute());
  }

  @Test
  void usingFiles() {
    Path path = Path.of("pom.xml");

    Assertions.assertEquals("pom.xml", path.toString());
    Assertions.assertFalse(path.isAbsolute());
    Assertions.assertTrue(Files.exists(path));
  }
}
