package reflection.reflection;

public class Person {
  private String firsName;
  private String lastName;

  public Person() {
  }

  public Person(String firsName, String lastName) {
    this.firsName = firsName;
    this.lastName = lastName;
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

}
