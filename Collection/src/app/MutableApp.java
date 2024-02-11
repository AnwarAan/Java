package app;

import java.util.List;

import data.Person;

public class MutableApp {
  public static void main(String[] args) {
    Person person = new Person("mca");
    person.addHobby("swim");
    person.addHobby("sleep");
    doSomething(person.getHobby());

    for (var hobby : person.getHobby()) {
      System.out.println(hobby);
    }
  }

  public static void doSomething(List<String> hobbies) {
    hobbies.add("gaming");
  }
}
