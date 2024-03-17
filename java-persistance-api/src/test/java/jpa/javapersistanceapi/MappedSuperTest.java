package jpa.javapersistanceapi;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jpa.javapersistanceapi.entity.Brand;
import jpa.javapersistanceapi.util.JpaUtil;

public class MappedSuperTest {
  @Test
  void mappedSuperclass() {
    EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();
    entityTransaction.begin();

    Brand brand = new Brand();
    brand.setId("xiaomi");
    brand.setName("Xiaomi");
    brand.setDescription("Xiaomi Global");
    brand.setCreatedAt(LocalDateTime.now());
    brand.setUpdatedAt(LocalDateTime.now());
    entityManager.persist(brand);

    entityTransaction.commit();
    entityManager.close();
  }
}
