package Java.Data;

public class Category {
  private String id;
  private boolean expensive;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    if (id != null) {
      this.id = id;
    }
  }

  public boolean isExpensive() {
    return this.expensive;
  }

  public boolean setExpensive(Boolean expensive) {
    return this.expensive = expensive;
  }

}
