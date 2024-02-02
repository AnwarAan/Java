package Java.Application;

import Java.Data.Animal;
import Java.Data.Cat;
import Java.Data.City;
import Java.Data.Location;

public abstract class AbstractApp {

  public static void main(String[] args) {
    // var location = new Location();
    var city = new City();
    city.name = "Jakarta";

    Animal animal = new Cat();
    animal.name = "MC";
    animal.run();
  }

}
