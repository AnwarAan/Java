package dist.application;

import dist.annotation.Fancy;
import dist.data.Avanza;
import dist.data.Car;

@Fancy(name = "Veloz")
public class CarApp {
  public static void main(String[] args) {

    Car car = new Avanza();
    car.drive();
    System.out.println(car.getTire());
  }
}
