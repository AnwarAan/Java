package dist.app;

import java.util.Arrays;
import java.util.Comparator;

import dist.util.Person;

public class ComparatorApp {

  public static void main(String[] args) {
    Person[] people = {
        new Person("Mca", "Indonesia"),
        new Person("muchamad", "Indonesia"),
        new Person("Choirul", "Indonesia")
    };

    Comparator<Person> comparator = new Comparator<Person>() {
      @Override
      public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
      }
    };

    Arrays.sort(people, comparator);
    System.out.println(Arrays.toString(people));

  }

}
