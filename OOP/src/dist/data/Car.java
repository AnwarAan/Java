package dist.data;

public interface Car extends Brand {
  void drive();

  int getTire();

  default boolean isBig() {
    return false;
  };
}
