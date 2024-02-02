package Java.Data;

public class Company {
  private String name;

  public String getName() {
    return name;
  }

  public String setName(String name) {
    return this.name = name;
  }

  public class Employee {
    private String name;
    private String company;

    public String getName() {
      return name;
    }

    public String getCompany() {
      return Company.this.getName();
    }

    public String setCompany() {
      return company;
    }

    public String setName(String name) {
      return this.name = name;
    }
  }
}
