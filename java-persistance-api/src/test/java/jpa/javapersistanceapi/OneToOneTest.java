package jpa.javapersistanceapi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jpa.javapersistanceapi.entity.Credential;
import jpa.javapersistanceapi.entity.Member;
import jpa.javapersistanceapi.entity.User;
import jpa.javapersistanceapi.entity.Wallet;
import jpa.javapersistanceapi.util.JpaUtil;

public class OneToOneTest {
  @Test
  void test1to1() {
    EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();

    entityTransaction.begin();

    Credential credential = new Credential();
    credential.setId("a");
    credential.setEmail("a@mail.com");
    credential.setPassword("123456");
    entityManager.persist(credential);

    User user = new User();
    user.setId("a");
    user.setName("mca");
    entityManager.persist(user);

    entityTransaction.commit();
    entityManager.close();
  }

  @Test
  void test1to12() {
    EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();

    entityTransaction.begin();

    User user = entityManager.find(User.class, "a");
    Assertions.assertEquals("a@mail.com", user.getCredential().getEmail());

    entityTransaction.commit();
    entityManager.close();
  }

  @Test
  void test1to13() {
    EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();

    entityTransaction.begin();

    User user = entityManager.find(User.class, "a");

    Wallet wallet = new Wallet();
    wallet.setUser(user);
    wallet.setBalance(1_000_000L);
    entityTransaction.commit();
    entityManager.close();
  }

  @Test
  void test1to14() {
    EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();

    entityTransaction.begin();

    User user = entityManager.find(User.class, "a");
    Assertions.assertNotNull(user.getCredential());
    Assertions.assertNotNull(user.getCredential());

    Wallet wallet = new Wallet();
    wallet.setUser(user);
    wallet.setBalance(1_000_000L);

    entityManager.persist(wallet);

    entityTransaction.commit();
    entityManager.close();
  }

  @Test
  void test1to15() {
    EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();

    entityTransaction.begin();

    User user = entityManager.find(User.class, "a");
    Assertions.assertNotNull(user.getCredential());
    Assertions.assertNotNull(user.getWallet());

    Assertions.assertEquals("a@mail.com", user.getCredential().getEmail());
    Assertions.assertEquals("123456", user.getCredential().getPassword());
    Assertions.assertEquals(1_000_000L, user.getWallet().getBalance());

    entityTransaction.commit();
    entityManager.close();
  }
}
