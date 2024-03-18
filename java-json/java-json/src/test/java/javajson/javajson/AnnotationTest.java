package javajson.javajson;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class AnnotationTest {
  @Test
  void annotaion() throws JsonProcessingException {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    ObjectMapper objectMapper = new ObjectMapper().configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false)
        .setDateFormat(dateFormat);

    Person person = new Person();
    person.setId("id");
    person.setName("mca");
    person.setFullName("mcnwr76");
    person.setPassword("123456");
    person.setCreatedAt(new Date());
    person.setUpdatedAt(new Date());

    String json = objectMapper.writeValueAsString(person);
    System.out.println(json);
  }
}
