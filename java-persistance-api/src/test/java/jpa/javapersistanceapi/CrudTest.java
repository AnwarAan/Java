package jpa.javapersistanceapi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jpa.javapersistanceapi.entity.Customer;
import jpa.javapersistanceapi.util.JpaUtil;

public class CrudTest {
  private EntityManagerFactory entityManagerFactory;

  @BeforeEach
  void setUp() {
    entityManagerFactory = JpaUtil.getEntityManagerFactory();
  }

  @Test
  void insert() {

    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();
    entityTransaction.begin();

    Customer customer = new Customer();
    customer.setId("1");
    customer.setName("mca");

    entityManager.persist(customer);
    entityTransaction.commit();
    entityManager.close();
  }

  @Test
  void find() {

    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();
    entityTransaction.begin();

    Customer customer = entityManager.find(Customer.class, "1");
    Assertions.assertNotNull(customer);
    Assertions.assertEquals("1", customer.getId());
    Assertions.assertEquals("mca", customer.getName());

    entityTransaction.commit();
    entityManager.close();
  }

  @Test
  void update() {

    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();
    entityTransaction.begin();

    Customer customer = entityManager.find(Customer.class, "1");
    customer.setName("mcnwr");
    entityManager.merge(customer);

    entityTransaction.commit();
    entityManager.close();
  }

  @Test
  void remove() {

    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();
    entityTransaction.begin();

    Customer customer = entityManager.find(Customer.class, "1");
    entityManager.remove(customer);

    entityTransaction.commit();
    entityManager.close();
  }
}
