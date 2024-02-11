package dist.app;

import java.util.Arrays;

import dist.util.Person;

public class ComparableApp {
  public static void main(String[] args) {
    Person[] people = {
        new Person("Mca", "Indonesia"),
        new Person("muchamad", "Indonesia"),
        new Person("Choirul", "Indonesia")
    };
    Arrays.sort(people);
    System.out.println(Arrays.toString(people));
  }

}
