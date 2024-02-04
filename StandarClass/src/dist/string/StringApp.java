package dist.string;

public class StringApp {
  public static void main(String[] args) {

    String name = "Muchamad Choirul Anwar";
    String lowerName = name.toLowerCase();
    String upperName = name.toUpperCase();
    String[] names = name.split("");

    for (String val : names) {
      System.out.println(val);
    }

    char[] chars = name.toCharArray();
    System.out.println("chars " + chars);

    System.out.println(lowerName);
    System.out.println(upperName);
    System.out.println(name.length());
    System.out.println(name.startsWith("M"));
    System.out.println(name.endsWith("A"));
    System.out.println(names[0]);

    System.out.println(" ".isBlank());
    System.out.println(" ".isEmpty());
    System.out.println("".isBlank());

    System.out.println("----------------------------------------------------------");

    StringBuilder builder = new StringBuilder();
    builder.append("Mucahamad");
    builder.append(" ");
    builder.append("Choirul");
    builder.append(" ");
    builder.append("Anwar");

    String fullName = builder.toString();
    System.out.println(builder);
    System.out.println(fullName);
  }

}
