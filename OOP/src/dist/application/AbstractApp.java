package dist.application;

import dist.data.Animal;
import dist.data.Cat;
import dist.data.City;
import dist.data.Location;

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
