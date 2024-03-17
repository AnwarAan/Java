package lombok.javalombok;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Singular;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {
  private String id;

  private String name;

  private Integer age;

  @Singular
  private List<String> hobbies;
}
