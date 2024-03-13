package jpa.javapersistanceapi;

import java.time.LocalDateTime;
import java.util.Calendar;

import org.junit.jupiter.api.Test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jpa.javapersistanceapi.entity.Category;
import jpa.javapersistanceapi.entity.CustomerType;
import jpa.javapersistanceapi.util.JpaUtil;

public class DateTimeTest {
  @Test
  void testDateTime() {
    EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();
    entityTransaction.begin();

    Category category = new Category();
    category.setName("Food");

    category.setCreatedAd(Calendar.getInstance());
    category.setUpdateAt(LocalDateTime.now());
    entityManager.persist(category);

    entityTransaction.commit();
    entityManager.close();
  }
}
