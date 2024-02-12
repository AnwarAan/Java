package app;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

import data.Person;
import data.PersonComparator;

public class SortedSetApp {
  public static void main(String[] args) {
    SortedSet<Person> persons = new TreeSet<>(new PersonComparator());
    // SortedSet<Person> persons = new TreeSet<>(new PersonComparator().reversed());

    persons.add(new Person("Mca"));
    persons.add(new Person("Choirul"));
    persons.add(new Person("Anwar"));

    for (Person person : persons) {
      System.out.println(person.getName());
    }

    SortedSet<Person> sortedSet = Collections.unmodifiableSortedSet(persons);
    // sortedSet.add(new Person("mc"));
  }
}
