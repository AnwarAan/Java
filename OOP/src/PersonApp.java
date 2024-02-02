public class PersonApp {
  public static void main(String[] args) {

    var person1 = new Person("Aan", "Bintara");
    person1.sayHello("Nurul");

    Person person2 = new Person("Mega");

    Person person3 = new Person();
    person3.name = "Luffy";

    System.out.println(person1.name);
    System.out.println(person1.address);
    System.out.println(person1.country);
    System.out.println(person2.name);
    System.out.println(person2.address);
    System.out.println(person2.country);
    System.out.println(person3.name);
  }
}
