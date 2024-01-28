public class Switch {
  public static void main(String[] args) {

    var value = "A";
    String greet;

    switch (value) {
      case "A":
        System.out.println("Excelent");
        break;
      case "B":
        System.out.println("Good");
        break;
      case "C":
        System.out.println("Try Again Please");
        break;
      default:
        System.out.println("Booh");
        break;
    }

    switch (value) {
      case "A" -> System.out.println("Excelent");
      case "B" -> System.out.println("Good");
      case "C" -> System.out.println("Try Again Please");
      default -> System.out.println("Booh");
    }

    switch (value) {
      case "A" -> greet = "Excelent";
      case "B" -> greet = "Good";
      case "C" -> greet = "Try Again Please";
      default -> greet = "Booh";
    }

    System.out.println(greet);

    greet = switch (value) {
      case "hi":
        yield "Excelent";
      case "hello":
        yield "Good";
      default:
        yield "Try Again Please";
    };

  }
}
