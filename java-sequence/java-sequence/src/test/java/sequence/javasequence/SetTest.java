package sequence.javasequence;

import java.util.SequencedSet;
import java.util.TreeSet;

import javax.sound.midi.Sequence;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SetTest {
  @Test
  void set() {
    SequencedSet<String> set = new TreeSet<>();
    set.add("Mc");
    set.add("Anwar");
    set.add("Aan");

    Assertions.assertEquals("Aan", set.getFirst());
    Assertions.assertEquals("Mc", set.getLast());

    SequencedSet<String> reversed = set.reversed();
    Assertions.assertEquals("Aan", reversed.getLast());
    Assertions.assertEquals("Mc", reversed.getFirst());

    String value = set.removeFirst();
    Assertions.assertEquals("Aan", value);

    value = set.removeFirst();
    Assertions.assertEquals("Anwar", value);

  }
}
