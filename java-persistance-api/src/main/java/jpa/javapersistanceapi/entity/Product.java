package jpa.javapersistanceapi.entity;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product {

  @Id
  private String id;

  private String name;

  private String description;

  private Long price;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "brand_id", referencedColumnName = "id")
  private Brand brand;

  @ManyToMany(mappedBy = "likes")
  private Set<User> likedBy;

  public Set<User> getLikedBy() {
    return likedBy;
  }

  public void setLikedBy(Set<User> likedBy) {
    this.likedBy = likedBy;
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

  public Long getPrice() {
    return price;
  }

  public void setPrice(Long price) {
    this.price = price;
  }

  public Brand getBrand() {
    return brand;
  }

  public void setBrand(Brand brand) {
    this.brand = brand;
  }
}
