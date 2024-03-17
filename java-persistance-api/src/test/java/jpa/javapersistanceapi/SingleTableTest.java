package jpa.javapersistanceapi;

import java.util.HashSet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jpa.javapersistanceapi.entity.Employee;
import jpa.javapersistanceapi.entity.Manager;
import jpa.javapersistanceapi.entity.Product;
import jpa.javapersistanceapi.entity.User;
import jpa.javapersistanceapi.entity.VicePresident;
import jpa.javapersistanceapi.util.JpaUtil;

public class SingleTableTest {
  @Test
  void testSingle() {
    EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();
    entityTransaction.begin();

    Employee employee = new Employee();
    employee.setId("e1");
    employee.setName("anwar");
    entityManager.persist(employee);

    Manager manager = new Manager();
    manager.setId("m1");
    manager.setName("sr. mc");
    manager.setTotalEmployee(100);
    entityManager.persist(manager);

    VicePresident vp = new VicePresident();
    vp.setId("vp1");
    vp.setName("sr. mc");
    vp.setTotalManager(10);
    entityManager.persist(vp);

    entityTransaction.commit();
    entityManager.close();
  }

  @Test
  void testSingle2() {
    EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();
    entityTransaction.begin();

    Manager manager = entityManager.find(Manager.class, "m1");
    Assertions.assertEquals("sr. mc", manager.getName());

    Employee employee = entityManager.find(Employee.class, "vp1");
    VicePresident vicePresident = (VicePresident) employee;
    Assertions.assertEquals("sr. mc", vicePresident.getName());

    entityTransaction.commit();
    entityManager.close();
  }
}
