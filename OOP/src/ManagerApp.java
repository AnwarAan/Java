public class ManagerApp {
  public static void main(String[] args) {
    var manager = new Manager("MCA");
    manager.sayHello("Anwar");

    var vp = new VicePresident("Anwar");
    vp.sayHello("Meita");

    System.out.println(manager.name);
    System.out.println(vp.name);
  }

}
