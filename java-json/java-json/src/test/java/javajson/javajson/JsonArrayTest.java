package javajson.javajson;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonArrayTest {
  @Test
  void jonArray() throws JsonProcessingException {
    List<String> hobbies = List.of("writing", "sleeping", "reading");

    ObjectMapper objectMapper = new ObjectMapper();
    String json = objectMapper.writeValueAsString(hobbies);

    System.out.println(json);
  }

  @Test
  void readJsonArray() throws JsonProcessingException {
    String json = """
        ["Coding","Reading","Traveling"]
        """;

    ObjectMapper objectMapper = new ObjectMapper();
    List<String> hobbies = objectMapper.readValue(json, new TypeReference<List<String>>() {
    });

    Assertions.assertEquals(List.of("Coding", "Reading", "Traveling"), hobbies);
  }
}
