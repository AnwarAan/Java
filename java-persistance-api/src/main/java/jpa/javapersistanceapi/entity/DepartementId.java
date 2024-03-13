package jpa.javapersistanceapi.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class DepartementId implements Serializable {
  @Column(name = "company_id")
  private String companyId;
  @Column(name = "departement_id")
  private String departementId;

  public DepartementId() {
  }

  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public String getDepartementId() {
    return departementId;
  }

  public void setDepartementId(String departementId) {
    this.departementId = departementId;
  }

}
