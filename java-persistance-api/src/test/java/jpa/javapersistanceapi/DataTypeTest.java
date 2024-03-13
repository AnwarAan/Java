package jpa.javapersistanceapi;

import org.junit.jupiter.api.Test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jpa.javapersistanceapi.entity.Customer;
import jpa.javapersistanceapi.entity.CustomerType;
import jpa.javapersistanceapi.util.JpaUtil;

public class DataTypeTest {
  @Test
  void testData() {
    EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();

    entityTransaction.begin();

    Customer customer = new Customer();
    customer.setId("3");
    customer.setName("Budi");
    customer.setAge((byte) 30);
    customer.setMarried(true);
    customer.setType(CustomerType.REGULAR);

    entityManager.persist(customer);

    entityTransaction.commit();
    entityManager.close();
  }
}
