package jpa.javapersistanceapi;

import org.junit.jupiter.api.Test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jpa.javapersistanceapi.entity.PaymentCreditCard;
import jpa.javapersistanceapi.entity.PaymentGopay;
import jpa.javapersistanceapi.util.JpaUtil;

public class InheritanceTest {
  @Test
  void testInheritance() {
    EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();
    entityTransaction.begin();

    PaymentGopay gopay = new PaymentGopay();
    gopay.setId("gopay1");
    gopay.setAmount(100_000L);
    gopay.setGopayId("089999999999");
    entityManager.persist(gopay);

    PaymentCreditCard creditCard = new PaymentCreditCard();
    creditCard.setId("cc1");
    creditCard.setAmount(500_000L);
    creditCard.setMaskedCard("4555-5555");
    creditCard.setBank("BCA");
    entityManager.persist(creditCard);

    entityTransaction.commit();
    entityManager.close();
  }

  @Test
  void testInheritance2() {
    EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();
    entityTransaction.begin();

    PaymentGopay gopay = entityManager.find(PaymentGopay.class, "gopay1");
    PaymentCreditCard creditCard = entityManager.find(PaymentCreditCard.class, "cc1");

    entityTransaction.commit();
    entityManager.close();
  }
}
