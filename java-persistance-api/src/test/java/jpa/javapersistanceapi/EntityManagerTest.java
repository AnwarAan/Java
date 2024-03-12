package jpa.javapersistanceapi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jpa.javapersistanceapi.util.JpaUtil;

public class EntityManagerTest {
  @Test
  void create() {

    EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    Assertions.assertNotNull(entityManager);
    entityManager.close();
  }
}
