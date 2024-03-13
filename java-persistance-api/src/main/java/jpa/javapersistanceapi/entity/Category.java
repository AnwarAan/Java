package jpa.javapersistanceapi.entity;

import java.time.LocalDateTime;
import java.util.Calendar;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jpa.javapersistanceapi.listener.UpdatedAtListener;

@Entity
@Table(name = "categories")
@EntityListeners({ UpdatedAtListener.class })
public class Category implements UpdatedAtAware {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private String id;

  private String name;

  private String description;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "created_at")
  private Calendar createdAd;

  @Column(name = "updated_at")
  private LocalDateTime updatedAt;

  public Category() {
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Calendar getCreatedAd() {
    return createdAd;
  }

  public void setCreatedAd(Calendar createdAd) {
    this.createdAd = createdAd;
  }

  public LocalDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(LocalDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

}
