package jpa.javapersistanceapi;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jpa.javapersistanceapi.entity.Member;
import jpa.javapersistanceapi.entity.Name;
import jpa.javapersistanceapi.util.JpaUtil;

public class CollectionTest {
  @Test
  void testCollection() {
    EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();

    entityTransaction.begin();

    Name name = new Name();
    name.setFirstName("m");
    name.setMiddleName("c");
    name.setLastName("a");

    Member member = new Member();
    member.setEmail("user2@mail.com");
    member.setName(name);

    member.setHobbies(new ArrayList<>());
    member.getHobbies().add("game");
    member.getHobbies().add("sleep");

    entityManager.persist(member);

    entityTransaction.commit();
    entityManager.close();
  }

  @Test
  void testCollection2() {
    EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();

    entityTransaction.begin();

    Member member = entityManager.find(Member.class, 2);
    member.getHobbies().add("halan-halan");
    entityManager.merge(member);

    entityTransaction.commit();
    entityManager.close();
  }
}
