package app;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapApp {
  public static void main(String[] args) {
    Map<String, String> empty = Collections.emptyMap();
    Map<String, String> singleton = Collections.singletonMap("name", "mca");
    Map<String, String> mutbale = new HashMap<>();

    mutbale.put("name", "mcnwr");
    Map<String, String> immutbale = Collections.unmodifiableMap(mutbale);
    Map<String, String> map = Map.of(
        "1", "one",
        "2", "wto",
        "3", "three");

    // map.put("a", "A");
  }
}
