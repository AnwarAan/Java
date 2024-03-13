package jpa.javapersistanceapi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jpa.javapersistanceapi.entity.Category;
import jpa.javapersistanceapi.util.JpaUtil;

public class ColumnTest {
  @Test
  void testColumn() {
    EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();
    entityTransaction.begin();

    Category category = new Category();
    category.setName("Gadget");
    category.setDescription("Gadget Termurah");
    entityManager.persist(category);

    Assertions.assertNotNull(category.getId());

    entityTransaction.commit();
    entityManager.close();
  }
}
