package jpa.javapersistanceapi;

import org.junit.jupiter.api.Test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jpa.javapersistanceapi.entity.Customer;
import jpa.javapersistanceapi.util.JpaUtil;

public class TransientTest {
  @Test
  void testTransient() {
    EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();
    entityTransaction.begin();

    Customer customer = new Customer();
    customer.setId("5");
    customer.setName("mca");
    customer.setEmail("user3@mail.com");
    customer.setFullName("mc anwar");

    entityManager.persist(customer);
    entityTransaction.commit();
    entityManager.close();
  }

}
