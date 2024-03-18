package javajson.javajson;

import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonObjectTest {
  @Test
  void createJson() throws JsonProcessingException {
    Map<String, Object> person = Map.of("firstName", "Mc",
        "lastName", "Anwar",
        "age", 30,
        "married", false,
        "address", Map.of(
            "street", "Jl. kaki",
            "city", "Jakarta",
            "country", "Indonesia"));

    ObjectMapper objectMapper = new ObjectMapper();
    String json = objectMapper.writeValueAsString(person);

    System.out.println(json);
  }

  @Test
  void readJson() throws JsonProcessingException {
    String json = """
        {
          "age": 30,
          "address": {
            "street": "Jalan belum ada",
            "city": "Jakarta",
            "country": "Indonesia"
          },
          "firstName": "Budi",
          "lastName": "Nugraha",
          "married": true
        }
        """;

    ObjectMapper objectMapper = new ObjectMapper();
    Map<String, Object> person = objectMapper.readValue(json, new TypeReference<Map<String, Object>>() {
    });

    Assertions.assertEquals("Budi", person.get("firstName"));
    Assertions.assertEquals("Nugraha", person.get("lastName"));
  }
}
