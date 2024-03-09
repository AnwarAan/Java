package reflection.reflection;

public enum Gender {
  MALE("Male"),
  FEMALE("Feale");

  private final String description;

  Gender(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }
}
