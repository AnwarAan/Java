package sequence.javasequence;

import java.util.LinkedHashMap;
import java.util.SequencedMap;
import java.util.TreeMap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MapTest {
  @Test
  void map() {

    SequencedMap<String, String> map = new TreeMap<>();
    map.put("c", "mcnwr");
    map.put("b", "Anwar");
    map.put("a", "MC");

    Assertions.assertEquals("MC", map.firstEntry().getValue());
    Assertions.assertEquals("mcnwr", map.lastEntry().getValue());

    SequencedMap<String, String> reversed = map.reversed();
    Assertions.assertEquals("mcnwr", reversed.firstEntry().getValue());
    Assertions.assertEquals("MC", reversed.lastEntry().getValue());
  }

  @Test
  void linkedMap() {
    SequencedMap<String, String> map = new LinkedHashMap<>();
    map.putFirst("c", "mcnwr");
    map.putFirst("b", "Anwar");
    map.putFirst("a", "MC");

    Assertions.assertEquals("MC", map.firstEntry().getValue());
    Assertions.assertEquals("mcnwr", map.lastEntry().getValue());
  }
}
