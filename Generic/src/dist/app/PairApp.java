package dist.app;

import dist.util.Pair;

public class PairApp {
  public static void main(String[] args) {

    Pair<String, Integer> pair = new Pair<String, Integer>("MCA", 100);
    // pair.setFirst("Anwar");

    System.out.println(pair.getFirst());
    System.out.println(pair.getSecond());
  }
}
