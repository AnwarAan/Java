public class Polymorphisme {
  public static void main(String[] args) {

    Employee employee = new Employee("MCA");
    employee.sayHello("Employee");

    employee = new Manager("MCA");
    employee.sayHello("Manager");

    employee = new VicePresident("MCA");
    employee.sayHello("VP");

    sayHello(new Employee("MCA"));
    sayHello(new Manager("MC"));
    sayHello(new VicePresident("MCNWR"));
  }

  static void sayHello(Employee employee) {
    if (employee instanceof VicePresident) {
      VicePresident vicePresident = (VicePresident) employee;
      System.out.println("Hello VP " + vicePresident.name);
    } else if (employee instanceof Manager) {
      Manager manager = (Manager) employee;
      System.out.println("Hello Manager " + manager.name);
    } else {
      System.out.println("Hello Employee " + employee.name);
    }

  }

}