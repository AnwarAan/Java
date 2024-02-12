package dist.util;

public class Person implements Comparable<Person> {
  public String name;
  public String address;

  public Person(String name, String address) {
    this.name = name;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public int compareTo(Person o) {
    return this.name.compareTo(o.name);
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return "Name : " + name + ", Address : " + address;
  }

}
