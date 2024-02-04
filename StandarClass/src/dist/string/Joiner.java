package dist.string;

import java.util.StringJoiner;

public class Joiner {
  public static void main(String[] args) {
    String[] names = { "Muchamad", "Choiru", "Anwar" };
    StringJoiner joiner = new StringJoiner(", ", "[", "]");

    for (String name : names) {
      joiner.add(name);
    }

    String value = joiner.toString();
    System.out.println(value);
  }

}
