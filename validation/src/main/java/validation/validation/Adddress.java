package validation.validation;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Adddress {
  @NotBlank(message = "Not Blank")
  @Size(max = 20, message = "Max 20 char")
  private String street;
  @NotBlank(message = "Not Blank")
  @Size(max = 20, message = "Max 20 char")

  private String city;
  @NotBlank(message = "Not Blank")
  @Size(max = 20, message = "Max 20 char")
  @NotNull(message = "Not null")
  private String country;

  public Adddress() {
  }

  public Adddress(String street, String city, String country) {
    this.street = street;
    this.city = city;
    this.country = country;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  @Override
  public String toString() {
    return "Adddress [street=" + street + ", city=" + city + ", country=" + country + "]";
  }

}
