package jpa.javapersistanceapi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import org.junit.jupiter.api.Test;
import jpa.javapersistanceapi.entity.Image;
import jpa.javapersistanceapi.util.JpaUtil;

public class LargeObjectTest {
  @Test
  void testLarge() throws IOException {
    EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();
    entityTransaction.begin();
    Image image = new Image();
    image.setName("Contoh Image");
    image.setDescription("Contoh Deskripsi Image");

    byte[] bytes = Files.readAllBytes(Path.of(getClass().getResource("/images/sample.png").getPath()));

    image.setImage(bytes);

    entityManager.persist(image);

    entityTransaction.commit();
    entityManager.close();
  }

  @Test
  void test1() throws IOException {
    System.out.println("THIS" + getClass().getResource("/meta-inf").getPath());
    // byte[] bytes =
    // Files.readAllBytes(Path.of(getClass().getResource("/images/sample.png").getPath()));
    // System.out.println(bytes);

  }
}
