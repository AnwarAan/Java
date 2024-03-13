package jpa.javapersistanceapi;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jpa.javapersistanceapi.entity.Member;
import jpa.javapersistanceapi.util.JpaUtil;

public class MapCollectionTest {
  @Test
  void testMap() {
    EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();
    entityTransaction.begin();

    Member member = entityManager.find(Member.class, 2);
    member.setSkills(new HashMap<>());
    member.getSkills().put("Java", 90);
    member.getSkills().put("Golang", 90);
    member.getSkills().put("PHP", 85);

    entityManager.merge(member);

    entityTransaction.commit();
    entityManager.close();
  }
}
