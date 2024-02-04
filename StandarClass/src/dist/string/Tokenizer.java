package dist.string;

import java.util.StringTokenizer;

public class Tokenizer {
  public static void main(String[] args) {
    String name = "Muchamad Choiru Anwar";
    StringTokenizer tokenizer = new StringTokenizer(name, " ");

    while (tokenizer.hasMoreTokens()) {
      String token = tokenizer.nextToken();
      System.out.println(token);
    }

  }
}
