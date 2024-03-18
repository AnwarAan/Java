package javajson.javajson;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMappedTest {

  @Test
  void createObjectMapper() {
    ObjectMapper objectMapper = new ObjectMapper();

    Assertions.assertNotNull(objectMapper);
  }
}
