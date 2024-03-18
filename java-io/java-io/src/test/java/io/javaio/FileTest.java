package io.javaio;

import java.io.File;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FileTest {
  @Test
  void createFile() {
    File file = new File("file.txt");

    Assertions.assertEquals("file.txt", file.getName());
    Assertions.assertFalse(file.exists());
  }

  @Test
  void createFileExist() {
    File file = new File("src/main/java/resource/application.properties");

    Assertions.assertEquals("application.properties", file.getName());
    Assertions.assertTrue(file.exists());
  }

}