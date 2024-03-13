package jpa.javapersistanceapi.listener;

import java.time.LocalDateTime;

import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jpa.javapersistanceapi.entity.UpdatedAtAware;

public class UpdatedAtListener {
  @PrePersist
  @PreUpdate
  public void setLastUpdatedAt(UpdatedAtAware object) {
    object.setUpdatedAt(LocalDateTime.now());
  }
}
