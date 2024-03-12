package validation.validation;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.groups.Default;

public class Customer {
  @NotBlank(message = "Not Blank", groups = { Default.class, })
  @Email(message = "Invalid format", groups = { Default.class, })
  private String email;
  @NotBlank(message = "Not Blank", groups = { Default.class, })

  private String name;

  public Customer() {
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Customer [email=" + email + ", name=" + name + "]";
  }

}
