package jpa.javapersistanceapi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jpa.javapersistanceapi.entity.Brand;
import jpa.javapersistanceapi.entity.Product;
import jpa.javapersistanceapi.util.JpaUtil;

public class FetchTest {
  @Test
  void fetch() {
    EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();
    entityTransaction.begin();

    Product product = entityManager.find(Product.class, "1");
    Brand brand = product.getBrand();
    brand.getName();
    Assertions.assertNotNull(brand);
    // Brand brand = entityManager.find(Brand.class, "samsung");

    entityTransaction.commit();
    entityManager.close();
  }
}
