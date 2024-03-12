package validation.validation;

import java.util.List;

import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class Person {
  @NotBlank(message = "can't blank")
  @Size(max = 20, message = "max 20 char")
  private String firstName;

  @NotBlank(message = "can't blank")
  @Size(max = 20, message = "max 20 char")
  private String lasttName;
  @Valid
  private Adddress adddress;

  private List<@NotBlank(message = "hobby can not blank") String> hobbies;

  public Person() {
  }

  @Valid
  public Person(@NotBlank(message = "can't blank") @Size(max = 20, message = "max 20 char") String firstName,
      @NotBlank(message = "can't blank") @Size(max = 20, message = "max 20 char") String lasttName,
      @Valid Adddress adddress) {
    this.firstName = firstName;
    this.lasttName = lasttName;
    this.adddress = adddress;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLasttName() {
    return lasttName;
  }

  public void setLasttName(String lasttName) {
    this.lasttName = lasttName;
  }

  public Adddress getAddress() {
    return adddress;
  }

  public void setAddress(Adddress adddress) {
    this.adddress = adddress;
  }

  public List<String> getHobbies() {
    return hobbies;
  }

  public void setHobbies(List<String> hobbies) {
    this.hobbies = hobbies;
  }

  public void sayHello(@NotBlank(message = "Not Blank") String name) {
    System.out.println("Hi " + name + ", my name is " + this.firstName);
  }

  @NotBlank(message = "Not Blank")
  public String fullName() {
    return firstName + " " + lasttName;
  }

  @Override
  public String toString() {
    return "Person [firstName=" + firstName + ", lasttName=" + lasttName + "]";
  }

}
