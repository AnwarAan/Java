package Java.Data;

public class Processor {
  public static final int PROCESSOR;

  static {
    PROCESSOR = Runtime.getRuntime().availableProcessors();
  }

}
