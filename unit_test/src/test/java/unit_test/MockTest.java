package unit_test;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MockTest {
  @Test
  void testMock() {
    List<String> list = Mockito.mock(List.class);

    Mockito.when(list.get(0)).thenReturn("success");
    Mockito.when(list.get(1)).thenReturn("MCA");

    System.out.println(list.get(0));
    // System.out.println(list.get(0));
    System.out.println(list.get(1));

    Mockito.verify(list, Mockito.times(1)).get(0);
  }
}
