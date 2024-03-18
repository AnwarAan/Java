package jpa.javapersistanceapi;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jpa.javapersistanceapi.entity.Transaction;
import jpa.javapersistanceapi.entity.TransactionCredit;
import jpa.javapersistanceapi.entity.TransactionDebit;
import jpa.javapersistanceapi.util.JpaUtil;

public class TablePerClassTest {
  @Test
  void testInsert() {
    EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();
    entityTransaction.begin();

    Transaction transaction = new Transaction();
    transaction.setId("t1");
    transaction.setCreatedAt(LocalDateTime.now());
    transaction.setBalance(1_000_000L);
    entityManager.persist(transaction);

    TransactionDebit debitTransaction = new TransactionDebit();
    debitTransaction.setId("t2");
    debitTransaction.setCreatedAt(LocalDateTime.now());
    debitTransaction.setBalance(2_000_000L);
    debitTransaction.setDebitAmount(1_000_000L);
    entityManager.persist(debitTransaction);

    TransactionCredit creditTransaction = new TransactionCredit();
    creditTransaction.setId("t3");
    creditTransaction.setCreatedAt(LocalDateTime.now());
    creditTransaction.setBalance(1_000_000L);
    creditTransaction.setCreditAmount(1_000_000L);
    entityManager.persist(creditTransaction);

    entityTransaction.commit();
    entityManager.close();
  }
}
