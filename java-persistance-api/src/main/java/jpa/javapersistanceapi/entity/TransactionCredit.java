package jpa.javapersistanceapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.*;

@Entity
@Table(name = "transactions_credit")
public class TransactionCredit extends Transaction {

  @Column(name = "credit_amount")
  private Long creditAmount;

  public Long getCreditAmount() {
    return creditAmount;
  }

  public void setCreditAmount(Long creditAmount) {
    this.creditAmount = creditAmount;
  }
}
