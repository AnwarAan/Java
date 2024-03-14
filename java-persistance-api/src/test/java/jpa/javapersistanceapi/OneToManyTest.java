package jpa.javapersistanceapi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jpa.javapersistanceapi.entity.Brand;
import jpa.javapersistanceapi.entity.Product;
import jpa.javapersistanceapi.entity.User;
import jpa.javapersistanceapi.util.JpaUtil;

public class OneToManyTest {
  @Test
  void test1toMany() {
    EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();

    entityTransaction.begin();

    Brand brand = new Brand();
    brand.setId("sumsang");
    brand.setName("Sumsang");

    Product product = new Product();
    product.setId("1");
    product.setName("Sumsang S10");
    product.setBrand(brand);
    product.setPrice(2_000_000L);
    entityManager.persist(product);

    Product product2 = new Product();
    product2.setId("2");
    product2.setName("Sumsang S20");
    product2.setBrand(brand);
    product2.setPrice(3_000_000L);
    entityManager.persist(product2);

    entityTransaction.commit();
    entityManager.close();
  }

  @Test
  void test1toMany2() {
    EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();
    entityTransaction.begin();

    Brand brand = entityManager.find(Brand.class, "samsung");
    Assertions.assertNotNull(brand.getProducts());
    Assertions.assertEquals(2, brand.getProducts().size());

    brand.getProducts().forEach(product -> System.out.println(product.getName()));

    entityTransaction.commit();
    entityManager.close();
  }

}
