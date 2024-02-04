package dist.application;

public class StackTrace {
  public static void main(String[] args) {

    String[] names = {
        "MCA", "Anwar", "Choirul"
    };

    // try {
    // System.out.println(names[100]);
    // } catch (Throwable throwable) {
    // StackTraceElement[] stackTraceElements = throwable.getStackTrace();
    // throwable.printStackTrace();
    // }

    try {
      sampleError();
    } catch (RuntimeException exception) {
      exception.printStackTrace();
    }

  }

  public static void sampleError() {
    String[] names = {
        "MCA", "Anwar", "Choirul"
    };

    try {
      System.out.println(names[100]);
    } catch (Throwable throwable) {
      throw new RuntimeException(throwable);
    }
  }

}
