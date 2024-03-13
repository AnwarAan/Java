package jpa.javapersistanceapi;

import org.junit.jupiter.api.Test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jpa.javapersistanceapi.entity.Departement;
import jpa.javapersistanceapi.entity.Departement;
import jpa.javapersistanceapi.entity.DepartementId;
import jpa.javapersistanceapi.entity.DepartementId;
import jpa.javapersistanceapi.util.JpaUtil;

public class EmbededIdTest {
  @Test
  void testEmbededId() {
    EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();

    entityTransaction.begin();

    DepartementId id = new DepartementId();
    id.setCompanyId("bethesda");
    id.setDepartementId("fallout");

    Departement departement = new Departement();
    departement.setId(id);
    departement.setName("Fallout 76");

    entityManager.persist(departement);
    entityTransaction.commit();
    entityManager.close();
  }
}
