package jpa.javapersistanceapi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import jakarta.persistence.EntityManagerFactory;
import jpa.javapersistanceapi.util.JpaUtil;

public class EntityManagerFactoryTest {
  @Test
  void create() {

    EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
    Assertions.assertNotNull(entityManagerFactory);
  }
}
