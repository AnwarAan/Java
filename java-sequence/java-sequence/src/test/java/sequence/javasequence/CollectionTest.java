package sequence.javasequence;

import java.util.ArrayList;
import java.util.List;
import java.util.SequencedCollection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CollectionTest {
  @Test
  void collection() {

    SequencedCollection<String> list = new ArrayList<>();
    list.addLast("Anwar");
    list.addFirst("Mca");
    list.addFirst("M");

    Assertions.assertEquals(List.of("Mca", "Anwar", "M"), list);
    Assertions.assertEquals("Mca", list.getFirst());
    Assertions.assertEquals("Anwar", list.getLast());

    SequencedCollection<String> reversed = list.reversed();
    Assertions.assertEquals(List.of("M", "Anwar", "Mca"), reversed);

    String value = list.removeFirst();
    Assertions.assertEquals("Mca", value);
    Assertions.assertEquals("Anwar", list.getFirst());

    value = list.removeLast();
    Assertions.assertEquals("M", list.getFirst());
    Assertions.assertEquals("Anwar", list.getFirst());
  }
}
