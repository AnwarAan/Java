package dist.data;

public class Country {
  private String name;

  public String getName() {
    return name;
  }

  public String setName(String name) {
    return this.name = name;
  }

  public static class City {
    private String name;

    public String getName() {
      return name;
    }

    public String setName(String name) {
      return this.name = name;
    }

  }
}
