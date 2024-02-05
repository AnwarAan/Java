package dist.data;

public class Avanza implements Car, Maintenance {
  public void drive() {
    System.out.println("Drive Avanza");

  }

  public int getTire() {
    return 4;
  }

  public String getBrand() {
    return "Toyoda";
  }

  public boolean isMaintenace() {
    return false;
  }

}
