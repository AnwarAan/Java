package jpa.javapersistanceapi;

import org.junit.jupiter.api.Test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jpa.javapersistanceapi.entity.Name;
import jpa.javapersistanceapi.entity.CustomerType;
import jpa.javapersistanceapi.entity.Member;
import jpa.javapersistanceapi.util.JpaUtil;

public class EmbededTest {
  @Test
  void testEmbeded() {
    EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();

    entityTransaction.begin();

    Name name = new Name();
    name.setFirstName("m");
    name.setMiddleName("c");
    name.setLastName("a");

    Member member = new Member();
    member.setEmail("user@mail.com");
    member.setName(name);

    entityManager.persist(member);

    entityTransaction.commit();
    entityManager.close();
  }

}
