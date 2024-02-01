
public class Hiding {
  public static void main(String[] args) {

    Child child = new Child();
    child.name = "MCA";
    child.doIt();
    System.err.println(child.name);

    Parent parent = (Parent) child;
    parent.doIt();
    System.out.println(parent.name);
  }
}

class Parent {
  String name;

  void doIt() {
    System.out.println("Do It Parent");
  }

}

class Child extends Parent {
  String name;

  void doIt() {
    System.out.println("Do It Child");
    System.out.println("Do It Child" + super.name);
  }
}