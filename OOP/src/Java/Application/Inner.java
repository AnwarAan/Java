package Java.Application;

import Java.Data.Company;

public class Inner {
  public static void main(String[] args) {

    Company company = new Company();
    company.setName("Google");

    Company.Employee employee = company.new Employee();
    employee.setName("MCA");

    System.out.println(company.getName());
    System.out.println(employee.getName());
    System.out.println(employee.getCompany());

    Company company2 = new Company();
    company.setName("Starbak");

    Company.Employee employee2 = company.new Employee();
    employee2.setName("Anwar");

    System.out.println(employee2.getName());
    System.out.println(employee2.getCompany());
  }
}
