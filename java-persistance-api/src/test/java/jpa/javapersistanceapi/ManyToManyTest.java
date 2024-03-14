package jpa.javapersistanceapi;

import java.util.HashSet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jpa.javapersistanceapi.entity.Brand;
import jpa.javapersistanceapi.entity.Product;
import jpa.javapersistanceapi.entity.User;
import jpa.javapersistanceapi.util.JpaUtil;

public class ManyToManyTest {
  @Test
  void test1toMany() {
    EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();
    entityTransaction.begin();

    User user = entityManager.find(User.class, "a");
    user.setLikes(new HashSet<>());

    Product product = entityManager.find(Product.class, "1");
    Product product2 = entityManager.find(Product.class, "2");

    user.getLikes().add(product);
    user.getLikes().add(product2);

    entityManager.merge(user);
    entityTransaction.commit();
    entityManager.close();
  }

  @Test
  void test1toMany2() {
    EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();
    entityTransaction.begin();

    User user = entityManager.find(User.class, "a");
    Product product = null;
    for (Product item : user.getLikes()) {
      product = item;
      break;
    }

    user.getLikes().remove(product);

    entityManager.merge(user);
    entityTransaction.commit();
    entityManager.close();
  }

  @Test
  void test1toMany3() {
    EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();
    entityTransaction.begin();

    Product product = entityManager.find(Product.class, "1");
    Brand brand = product.getBrand();
    brand.getName();
    Assertions.assertNotNull(brand);

    entityTransaction.commit();
    entityManager.close();
  }
}
