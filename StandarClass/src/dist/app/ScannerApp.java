package dist.app;

import java.util.Scanner;

public class ScannerApp {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Nama : ");
    String nama = scanner.nextLine();

    System.out.print("Umur : ");
    Integer age = scanner.nextInt();

    System.out.println("Hello : " + nama + " Age : " + age);
    scanner.close();
  }

}
