package Java.Application;

import Java.Data.Avanza;
import Java.Data.Car;

public class CarApp {
  public static void main(String[] args) {

    Car car = new Avanza();
    car.drive();
    System.out.println(car.getTire());
  }
}
