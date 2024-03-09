package reflection.reflection;

import java.util.List;

import reflection.annotation.NotBlank;

public final class Person implements Nameable {
  @NotBlank
  private String firsName;
  @NotBlank(allowEmptyString = true)
  private String lastName;
  private int age;
  private List<String> hobbies;

  public Person() {
  }

  public Person(String firsName, String lastName) {
    this.firsName = firsName;
    this.lastName = lastName;
  }

  public Person(String firsName, String lastName, int age) {
    this.firsName = firsName;
    this.lastName = lastName;
    this.age = age;
  }

  public Person(String firsName, String lastName, int age, List<String> hobbies) {
    this.firsName = firsName;
    this.lastName = lastName;
    this.age = age;
    this.hobbies = hobbies;
  }

  public String getFirstName() {
    return firsName;
  }

  public void setFirstName(String firsName) {
    this.firsName = firsName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public List<String> getHobbies() {
    return hobbies;
  }

  public void setHobbies(List<String> hobbies) {
    this.hobbies = hobbies;
  }

}
