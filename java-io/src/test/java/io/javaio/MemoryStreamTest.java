package io.javaio;

import java.io.StringWriter;

import org.junit.jupiter.api.Test;

public class MemoryStreamTest {
  @Test
  void memoryStrea() {
    StringWriter writer = new StringWriter();
    for (int i = 0; i < 10; i++) {
      writer.write("Hello mca");
    }

    String content = writer.getBuffer().toString();
    System.out.println(content);
  }
}
