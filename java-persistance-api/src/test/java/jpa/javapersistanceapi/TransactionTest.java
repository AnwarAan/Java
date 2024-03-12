package jpa.javapersistanceapi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jpa.javapersistanceapi.util.JpaUtil;

public class TransactionTest {
  @Test
  void testTransaction() {
    EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();

    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();

    Assertions.assertNotNull(entityTransaction);

    try {
      entityTransaction.begin();

      entityTransaction.commit();
    } catch (Throwable e) {
      entityTransaction.rollback();
    }
  }
}
