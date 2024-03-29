package jpa.javapersistanceapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "manager")
@DiscriminatorValue("MANAGER")
public class Manager extends Employee {
  @Column(name = "total_employee")
  private Integer totalEmployee;

  public Integer getTotalEmployee() {
    return totalEmployee;
  }

  public void setTotalEmployee(Integer totalEmployee) {
    this.totalEmployee = totalEmployee;
  }

}
