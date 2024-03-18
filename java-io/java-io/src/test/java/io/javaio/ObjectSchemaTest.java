package io.javaio;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ObjectSchemaTest {
  @Test
  void savePerson() {
    Person person = new Person();
    person.setId("1");
    person.setName("mca");

    Path path = Path.of("mca.person");

    try (OutputStream stream = Files.newOutputStream(path);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(stream)) {
      objectOutputStream.writeObject(person);
      objectOutputStream.flush();
    } catch (IOException e) {
      Assertions.fail(e);
    }
  }

  @Test
  void getPerson() throws ClassNotFoundException {
    Path path = Path.of("mca.person");
    try (InputStream stream = Files.newInputStream(path)) {
      ObjectInputStream objectInputStream = new ObjectInputStream(stream);

      Person person = (Person) objectInputStream.readObject();
      Assertions.assertEquals("1", person.getId());
      Assertions.assertEquals("mca", person.getName());
    } catch (IOException e) {
      Assertions.fail(e);
    }
  }
}
