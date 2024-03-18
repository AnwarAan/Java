package io.javaio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SmallTest {
  @Test
  void writeSmallFile() throws IOException {
    Path path1 = Path.of("small1.txt");
    byte[] bytes = "Hello MCA".getBytes();
    Files.write(path1, bytes);
    Assertions.assertTrue(Files.exists(path1));

    Path path2 = Path.of("samll2.txt");
    Files.write(path2, bytes);
    Assertions.assertTrue(Files.exists(path2));
  }

  @Test
  void readSmallFile2() throws IOException {
    Path path1 = Path.of("small1.txt");
    byte[] bytes = Files.readAllBytes(path1);
    String content1 = new String(bytes);
    Assertions.assertEquals("Hello MCA", content1);

    Path path2 = Path.of("small1.txt");
    String content2 = Files.readString(path2);
    Assertions.assertEquals("Hello MCA", content2);
  }
}
