package javajson.javajson;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class FeatureTest {
  @Test
  void mapperFeature() throws JsonProcessingException {
    ObjectMapper objectMapper = new ObjectMapper().configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, false);

    String json = """
        {"ID":"1","Name":"MCA"}
                """;

    Person person = new Person();
    Assertions.assertEquals(1, person.getId());
    Assertions.assertEquals("MCA", person.getName());
  }

  @Test
  void deserializedFeature() throws JsonProcessingException {
    ObjectMapper objectMapper = new ObjectMapper().configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, false)
        .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
        .configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, false);

    String json = """
        {"id":"1","Name":"Mca","age":30,"hobbies":"Coding"}
        """;

    Person person = objectMapper.readValue(json, Person.class);
    Assertions.assertEquals("1", person.getId());
    Assertions.assertEquals("Mca", person.getName());
    Assertions.assertEquals(List.of("Coding"), person.getHobbies());
  }

  @Test
  void serializationFeature() throws JsonProcessingException {
    Person person = new Person();
    person.setId("id");
    person.setName("Mca");
    person.setHobbies(List.of("Coding", "Reading"));

    Address address = new Address();
    address.setStreet("jl. kaki");
    address.setCity("Jakarta");
    address.setCountry("Indonesia");
    // person.setAddress(address);

    ObjectMapper objectMapper = new ObjectMapper().configure(SerializationFeature.INDENT_OUTPUT, true);
    String json = objectMapper.writeValueAsString(person);
    System.out.println(json);
  }

  @Test
  void serializationInclusion() throws JsonProcessingException {
    ObjectMapper objectMapper = new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL);

    Person person = new Person();
    person.setId("id");
    person.setName("mca");

    String json = objectMapper.writeValueAsString(person);
    System.out.println(json);
  }
}
