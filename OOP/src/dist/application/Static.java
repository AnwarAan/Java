package dist.application;

import static dist.data.Constant.*;

import dist.data.Country;
import dist.data.Processor;
import dist.util.Math;

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
