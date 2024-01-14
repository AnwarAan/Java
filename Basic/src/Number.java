public class Number {
  public static void main(String[] args) {
    byte Byte = 100;
    short Short = 1000;
    int Int = 1000000;
    long Long1 = 100000000;
    long Long2 = 100000000;

    System.out.println(Byte);
    System.out.println(Short);
    System.out.println(Int);
    System.out.println(Long1);
    System.out.println(Long2);

    // -------------------------------------------------

    float Float1 = 1.2344567F;
    double Float2 = 1.234456789101F;

    System.out.println(Float1);
    System.out.println(Float2);

    // -------------------------------------------------

    int Decimal = 25;
    int Hex = 0XA13;
    int Binary = 0b1010;

    System.out.println(Decimal);
    System.out.println(Hex);
    System.out.println(Binary);

    // -------------------------------------------------

    long balance = 1000_000_000;
    long amount = 123_456_789;

    System.out.println(balance);
    System.out.println(amount);

    // -------------------------------------------------
    ///// Widening
    ///// Narrowing

    byte thisByte = 10;
    short thisShort = thisByte;
    int thisInt = thisShort;
    long thisLong = thisInt;
    float thisFloat = thisLong;
    double thisDouble = thisFloat;
    float thisFloat2 = (float) thisDouble;
    long thisLong2 = (long) thisFloat2;
    int thisInt2 = (int) thisLong2;
    short thisShort2 = (short) thisInt2;
    byte thisByte2 = (byte) thisShort2;

    System.out.println(thisByte2);

  }
}