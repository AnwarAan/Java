package Java.Application;

import static Java.Data.Constant.*;
import Java.Data.Country;
import Java.Data.Processor;
import Java.Util.Math;

public class Static {
  public static void main(String[] args) {

    System.out.println(APPLICATION);
    System.out.println(VERSION);

    System.out.println(Math.sum(1, 2, 3, 4, 5));

    Country.City city = new Country.City();
    city.setName("Jakrta");

    System.out.println(city.getName());
    System.out.println(Processor.PROCESSOR);
  }
}
