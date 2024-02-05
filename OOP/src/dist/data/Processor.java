package dist.data;

public class Processor {
  public static final int PROCESSOR;

  static {
    PROCESSOR = Runtime.getRuntime().availableProcessors();
  }

}
