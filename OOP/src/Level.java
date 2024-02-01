
public enum Level {
  STANDAR("Standar"), PREMIUM("Premium"), VIP("Vip");

  private String description;

  Level(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }

}
