package dist.number;

public class Number {
  public static void main(String[] args) {

    Integer intVal = 10;
    Long longVal = intVal.longValue();
    Double doubleVal = longVal.doubleValue();
    Short shortVal = doubleVal.shortValue();

    String number = "1000";
    String number2 = "1000.000";
    Integer intNum = Integer.valueOf(number);
    Long longNum = Long.valueOf(number);
    Double doubleNum = Double.valueOf(number);

    System.out.println(intNum);
    System.out.println(doubleNum);
  }
}
