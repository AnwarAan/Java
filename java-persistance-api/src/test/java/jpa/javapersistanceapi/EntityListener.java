package jpa.javapersistanceapi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jpa.javapersistanceapi.entity.Member;
import jpa.javapersistanceapi.entity.Category;
import jpa.javapersistanceapi.util.JpaUtil;

public class EntityListener {
  @Test
  void testListener() {
    EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();

    entityTransaction.begin();

    Category category = new Category();
    category.setName("example");

    entityManager.persist(category);

    entityTransaction.commit();
    entityManager.close();
  }

  @Test
  void testListener2() {
    EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();

    entityTransaction.begin();

    Member member = entityManager.find(Member.class, 1);
    Assertions.assertEquals("jr. mc anwar 76", member.getFullName());

    entityTransaction.commit();
    entityManager.close();
  }
}
